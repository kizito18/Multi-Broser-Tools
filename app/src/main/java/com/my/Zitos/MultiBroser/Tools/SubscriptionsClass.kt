package com.my.Zitos.MultiBroser.Tools

import android.app.Activity
import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.android.billingclient.api.AcknowledgePurchaseParams
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingClientStateListener
import com.android.billingclient.api.BillingFlowParams
import com.android.billingclient.api.BillingFlowParams.ProductDetailsParams
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.PendingPurchasesParams
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.android.billingclient.api.QueryProductDetailsParams
import com.android.billingclient.api.QueryProductDetailsParams.Product
import com.android.billingclient.api.QueryPurchasesParams
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class SubscriptionClass (context: Context){


    var isPlayBillingConnected by mutableStateOf(false)



    private var billingClient = BillingClient.newBuilder(context)
        .enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().enablePrepaidPlans().build())
        //.enablePendingPurchases(PendingPurchasesParams.newBuilder().enablePrepaidPlans().build())
        .setListener { billingResult: BillingResult, list: List<Purchase>? ->
        if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && list != null) {
            for (purchase in list) {
                verifySubPurchase(purchase)
            }
        }
    }.build()




    val productDetailsList  =   mutableListOf<ProductDetails>()



    init {

        connectGooglePlayBilling()

    }





    fun onItemClick(pos: Int,context: Context) {
        launchPurchaseFlow(productDetailsList[pos],context)
    }





    fun connectGooglePlayBilling() {
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    // The BillingClient is ready. You can query purchases here.

                    showProducts()
                    isPlayBillingConnected = true

                }
            }

            override fun onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
                isPlayBillingConnected = false
                connectGooglePlayBilling()
            }
        })
    }


    fun showProducts(){

            val productList = listOf( //Product 1
            Product.newBuilder()
                .setProductId("premium1")
                .setProductType(BillingClient.ProductType.SUBS)
                .build() ,

            //Product 2
                QueryProductDetailsParams.Product.newBuilder()
                        .setProductId("basic1")
                        .setProductType(BillingClient.ProductType.SUBS)
                        .build()


        )
        val params = QueryProductDetailsParams.newBuilder()
            .setProductList(productList)
            .build()
        billingClient.queryProductDetailsAsync(
            params
        ) { billingResult: BillingResult?, prodDetailsList: List<ProductDetails>? ->
            // Process the result
            productDetailsList.clear()
                //loadProducts!!.visibility = View.INVISIBLE
                productDetailsList.addAll(prodDetailsList!!)

        }

    }




    fun checkSubscription(
        context: Context,
        onPremiumPlanFound: () -> Unit,
        onBasicPlanFound: () -> Unit,
        onSubscriptionNotFound: () -> Unit
    ) {
        billingClient = BillingClient.newBuilder(context)
            .enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().enablePrepaidPlans().build())
            .setListener { billingResult: BillingResult?, list: List<Purchase?>? -> }
            .build()
        val finalBillingClient: BillingClient = billingClient as BillingClient
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingServiceDisconnected() {
                connectGooglePlayBilling()
            }
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    finalBillingClient.queryPurchasesAsync(
                        QueryPurchasesParams.newBuilder()
                            .setProductType(BillingClient.ProductType.SUBS).build()
                    ) { billingResult1: BillingResult, list: List<Purchase?> ->
                        if (billingResult1.responseCode == BillingClient.BillingResponseCode.OK) {

                            CoroutineScope(Dispatchers.Main).launch {

                                if (list.isNotEmpty()) {

                                   if (list.size >1) {

                                       val hasPremium = if (list[1]!!.products[0] == "premium1") {
                                           true
                                       } else {
                                           false
                                       }

                                       val hasBasic = if (list[1]!!.products[0] == "basic1") {
                                           true
                                       } else {
                                           false
                                       }


                                       if (hasBasic && hasPremium) {
                                           onPremiumPlanFound()
                                       } else {
                                           if (hasPremium) {
                                               onPremiumPlanFound()
                                           } else {
                                               if (hasBasic) {
                                                   onBasicPlanFound()
                                               } else {
                                                   onSubscriptionNotFound()
                                               }
                                           }
                                       }


                                    }else{


                                       val hasPremium = if (list[0]!!.products[0] == "premium1") {
                                           true
                                       } else {
                                           false
                                       }

                                       val hasBasic = if (list[0]!!.products[0] == "basic1") {
                                           true
                                       } else {
                                           false
                                       }



                                       if (hasBasic && hasPremium) {
                                           onPremiumPlanFound()
                                       } else {
                                           if (hasPremium) {
                                               onPremiumPlanFound()
                                           } else {
                                               if (hasBasic) {
                                                   onBasicPlanFound()
                                               } else {
                                                   onSubscriptionNotFound()
                                               }
                                           }
                                       }


                                   }





                                } else {
                                    // de-activate premium feature
                                    onSubscriptionNotFound()
                                }

                            }
                        }
                    }
                }
            }
        })
    }






    fun launchPurchaseFlow(productDetails: ProductDetails,context: Context) {
        assert(productDetails.subscriptionOfferDetails != null)
        val productDetailsParamsList = listOf(
            ProductDetailsParams.newBuilder()
                .setProductDetails(productDetails)
                .setOfferToken(productDetails.subscriptionOfferDetails!![0].offerToken)
                .build()
        )
        val billingFlowParams = BillingFlowParams.newBuilder()
            .setProductDetailsParamsList(productDetailsParamsList)
            .build()
        billingClient.launchBillingFlow(context as Activity, billingFlowParams)

    }




    fun verifySubPurchase(purchases: Purchase) {
        val acknowledgePurchaseParams = AcknowledgePurchaseParams
            .newBuilder()
            .setPurchaseToken(purchases.purchaseToken)
            .build()
        billingClient.acknowledgePurchase(
            acknowledgePurchaseParams
        ) { billingResult: BillingResult ->
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                //use prefs to set premium
                //Setting premium to 1
                // 1 - premium
                // 0 - no premium
               // prefs!!.premium = 1
                //reloadScreen()



            }
        }
    }






    fun restorePurchases(
        context: Context,
        onPurchasesFound: () -> Unit,
        onPurchasesNotFound: () -> Unit
    ){
        billingClient = BillingClient.newBuilder(context)
            .enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build())
            .setListener { billingResult: BillingResult?, list: List<Purchase?>? -> }
            .build()
        val finalBillingClient: BillingClient = billingClient as BillingClient
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingServiceDisconnected() {}
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    finalBillingClient.queryPurchasesAsync(
                        QueryPurchasesParams.newBuilder()
                            .setProductType(BillingClient.ProductType.SUBS).build()
                    ) { billingResult1: BillingResult, list: List<Purchase?> ->
                        if (billingResult1.responseCode == BillingClient.BillingResponseCode.OK) {
                            if (list.isNotEmpty()) {
                               // prefs!!.premium = 1 // set 1 to activate premium feature
                                //showSnackBar(btn_restore_fab, "Successfully restored")
                                onPurchasesFound()
                            } else {
                               // showSnackBar(btn_restore_fab, "Oops, No purchase found.")
                                //prefs!!.premium = 0 // set 0 to de-activate premium feature
                                onPurchasesNotFound()
                            }
                        }
                    }
                }
            }
        })
    }




     fun onActivityResume() {

        billingClient.queryPurchasesAsync(
            QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.SUBS).build()
        ) { billingResult: BillingResult, list: List<Purchase> ->
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                for (purchase in list) {
                    if (purchase.purchaseState == Purchase.PurchaseState.PURCHASED && !purchase.isAcknowledged) {
                        verifySubPurchase(purchase)
                    }
                }
            }
        }
    }







}

