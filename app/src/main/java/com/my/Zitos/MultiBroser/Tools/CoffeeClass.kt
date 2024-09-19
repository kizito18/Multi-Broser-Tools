package com.my.Zitos.MultiBroser.Tools

import android.app.Activity
import android.content.Context
import android.util.Log
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingClientStateListener
import com.android.billingclient.api.BillingFlowParams
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.ConsumeParams
import com.android.billingclient.api.ConsumeResponseListener
import com.android.billingclient.api.PendingPurchasesParams
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.android.billingclient.api.QueryProductDetailsParams

class CoffeeClass (context: Context){



    private var billingClient = BillingClient.newBuilder(context)
        .enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build())
        .setListener { billingResult: BillingResult, list: List<Purchase>? ->
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && list != null) {
                for (purchase in list) {
                    verifyPurchase(purchase)
                }
            }
        }.build()




    val productDetailsList  =   mutableListOf<ProductDetails>()



    init {

        connectGooglePlayBilling()
    }






     fun onItemClick(context: Context,pos: Int) {

        launchPurchaseFlow(
            productDetails=  productDetailsList[pos],
            context = context
        )

    }



    fun connectGooglePlayBilling() {
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingServiceDisconnected() {
                connectGooglePlayBilling()
            }

            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    showProducts()
                }
            }
        })
    }


    fun showProducts() {
        val productList = listOf( //Product 1
            QueryProductDetailsParams.Product.newBuilder()
                .setProductId("coffee1")
                .setProductType(BillingClient.ProductType.INAPP)
                .build(),

            //Product 2
            /* QueryProductDetailsParams.Product.newBuilder()
                 .setProductId("test_coins_201")
                 .setProductType(BillingClient.ProductType.INAPP)
                 .build(),

             */
        )
        val params = QueryProductDetailsParams.newBuilder()
            .setProductList(productList)
            .build()
        billingClient.queryProductDetailsAsync(params) { billingResult: BillingResult?, list: List<ProductDetails>? ->
            productDetailsList.clear()
            //handler.postDelayed({
                //loadProducts!!.visibility = View.INVISIBLE //
                productDetailsList.addAll(list!!)

            //}, 2000)
        }
    }

    fun launchPurchaseFlow(productDetails: ProductDetails?,context: Context) {
        val productDetailsParamsList = listOf(
            BillingFlowParams.ProductDetailsParams.newBuilder()
                .setProductDetails(productDetails!!)
                .build()
        )
        val billingFlowParams = BillingFlowParams.newBuilder()
            .setProductDetailsParamsList(productDetailsParamsList)
            .build()
        billingClient.launchBillingFlow(context as Activity, billingFlowParams)
    }

    fun verifyPurchase(purchase: Purchase) {
        Log.d("testCoins", "Verify Purchase $purchase")
        val consumeParams = ConsumeParams.newBuilder()
            .setPurchaseToken(purchase.purchaseToken)
            .build()
        val listener =
            ConsumeResponseListener { billingResult: BillingResult, s: String? ->
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    giveUserCoins(purchase)
                }
            }
        billingClient.consumeAsync(consumeParams, listener)
    }




    fun giveUserCoins(purchase: Purchase) {
        /*
        for (i in productIds!!.indices) {
            if (purchase.products[0] == productIds!![i]) {
                //set coins
            }
        }

         */
    }








}