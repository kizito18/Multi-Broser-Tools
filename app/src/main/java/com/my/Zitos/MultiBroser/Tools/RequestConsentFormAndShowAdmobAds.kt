package com.my.Zitos.MultiBroser.Tools

import android.app.Activity
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.applovin.mediation.MaxAd
import com.applovin.mediation.MaxError
import com.applovin.mediation.MaxReward
import com.applovin.mediation.MaxRewardedAdListener
import com.applovin.mediation.ads.MaxAdView
import com.applovin.mediation.ads.MaxRewardedAd
import com.applovin.sdk.AppLovinMediationProvider
import com.applovin.sdk.AppLovinSdk
import com.applovin.sdk.AppLovinSdkInitializationConfiguration
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.google.android.ump.ConsentForm
import com.google.android.ump.ConsentInformation
import com.google.android.ump.ConsentRequestParameters
import com.google.android.ump.UserMessagingPlatform
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.math.pow


class RequestConsentFormAndShowAdmobAds(context: Context,adsType: AdsType){


    private  var consentInformation: ConsentInformation? = null
    // Use an atomic boolean to initialize the Google Mobile Ads SDK and load ads once.
    private var isMobileAdsInitializeCalled = AtomicBoolean(false)
    private  val tag = "ConsentForm Class"


    private lateinit var adRequest :AdRequest

    private var admobRewardedVideoAd: RewardedAd? = null

    var admobInterstitialAd: InterstitialAd? = null

    var coinClaimed by   mutableIntStateOf(0)


    init {


        /*
        val testDeviceHashedId =  "C4F56F692D0FB747EE5FA87C64B95C37"
        val debugSettings = ConsentDebugSettings.Builder(context as Activity)
            .setDebugGeography(ConsentDebugSettings.DebugGeography.DEBUG_GEOGRAPHY_EEA)
            .addTestDeviceHashedId(testDeviceHashedId)
            .build()

         */



        // Create a ConsentRequestParameters object.
        val params = ConsentRequestParameters
            .Builder()
            // .setConsentDebugSettings(debugSettings)//remove for production build
            .build()


        consentInformation = UserMessagingPlatform.getConsentInformation(context)
        //this will enable us to GDPR massage again
        // consentInformation!!.reset()//remove for production build
        consentInformation!!.requestConsentInfoUpdate(
            context as Activity,
            params,
            {
                UserMessagingPlatform.loadAndShowConsentFormIfRequired(
                    context,
                    ConsentForm.OnConsentFormDismissedListener { loadAndShowError ->
                        // Consent gathering failed.
                        if (loadAndShowError != null) {
                            Log.w(
                                "mainActivityConsentForm", String.format(
                                    "%s: %s",
                                    loadAndShowError.errorCode,
                                    loadAndShowError.message
                                )
                            )
                        }

                        // Consent has been gathered.
                        if (consentInformation!!.canRequestAds()) {
                            initializeAdmobAds(context = context, adsType = adsType)
                            initializeAppLovinAds(context = context)
                        }
                    }
                )
            },
            { requestConsentError ->
                // Consent gathering failed.
                Log.w(
                    "mainActivityConsentForm", String.format(
                        "%s: %s",
                        requestConsentError.errorCode,
                        requestConsentError.message
                    )
                )
            })

        // Check if you can initialize the Google Mobile Ads SDK in parallel
        // while checking for new consent information. Consent obtained in
        // the previous session can be used to request ads.
        if (consentInformation!!.canRequestAds()) {
            initializeAdmobAds(context = context, adsType = adsType)
            initializeAppLovinAds(context = context)
        }


    }




    private fun initializeAdmobAds(context: Context, adsType: AdsType) {

        if (isMobileAdsInitializeCalled.getAndSet(true)) {
            return
        }

        CoroutineScope(Dispatchers.IO).launch {

            // Initialize the Google Mobile Ads SDK.
            MobileAds.initialize(context)

            withContext(Dispatchers.Main) {

                //  Request an ad
                adRequest = AdRequest.Builder().build()

                if (adsType == AdsType.INTERSTITIAL_ADS) {
                    loadInterstitialAd(context = context)
                }

                if (adsType == AdsType.VIDEO_ADS) {
                    loadRewardedVideoAd(context = context)
                }

            }
        }
    }





    private fun loadInterstitialAd(context: Context){


        InterstitialAd.load(context,
            ObjectsIds.ADMOB_INTERSTITIAL_AD_ID,
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.d("TAG InterstitialAd ", adError.toString())
                    admobInterstitialAd = null

                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    Log.d("TAG InterstitialAd", "Ad was loaded")
                    admobInterstitialAd = interstitialAd


                    admobInterstitialAd?.fullScreenContentCallback =
                        object : FullScreenContentCallback() {
                            override fun onAdClicked() {
                                // Called when a click is recorded for an ad.
                                Log.d(tag, "Ad was clicked.")
                            }

                            override fun onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                Log.d(tag, "Ad dismissed fullscreen content.")
                                //mInterstitialAd = null
                                //isAdsShownBefore = true
                            }

                            override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                                // Called when ad fails to show.
                                Log.e(tag, "Ad failed to show fullscreen content.")
                                admobInterstitialAd = null
                            }

                            override fun onAdImpression() {
                                // Called when an impression is recorded for an ad.
                                Log.d(tag, "Ad recorded an impression.")
                            }

                            override fun onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(tag, "Ad showed fullscreen content.")
                            }
                        }


                }
            })

    }





    private fun loadRewardedVideoAd(context: Context) {

        RewardedAd.load(context,ObjectsIds.ADMOB_VIDEO_AD_ID, adRequest, object : RewardedAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(tag, adError.toString())
                admobRewardedVideoAd = null
            }

            override fun onAdLoaded(videoAd: RewardedAd) {
                Log.d(tag, "VideoAd was loaded.")
                admobRewardedVideoAd = videoAd

                admobRewardedVideoAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                    override fun onAdClicked() {
                        // Called when a click is recorded for an ad.
                        Log.d(tag, "VideoAd was clicked.")
                    }

                    override fun onAdDismissedFullScreenContent() {
                        // Called when ad is dismissed.
                        // Set the ad reference to null so you don't show the ad a second time.
                        Log.d(tag, "VideoAd dismissed fullscreen content.")
                        admobRewardedVideoAd = null
                        loadRewardedVideoAd(context = context)
                    }

                    override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                        // Called when ad fails to show.
                        Log.e(tag, "VideoAd failed to show fullscreen content.")
                        admobRewardedVideoAd = null
                    }

                    override fun onAdImpression() {
                        // Called when an impression is recorded for an ad.
                        Log.d(tag, "VideoAd recorded an impression.")
                    }

                    override fun onAdShowedFullScreenContent() {
                        // Called when ad is shown.
                        Log.d(tag, "VideoAd showed fullscreen content.")
                    }
                }
            }
        })

    }


    fun showAdmobVideoAds(context: Context,onRewardAdded: () -> Unit){

        admobRewardedVideoAd?.let { ad ->
            ad.show(context as Activity, OnUserEarnedRewardListener { rewardItem ->
                // Handle the reward.
                onRewardAdded()

                Log.d(tag, "User earned the reward.")
            })
        } ?: run {
            Log.d(tag, "The rewarded ad wasn't ready yet.")

        }

    }








    var applovinBannerAdView by mutableStateOf<MaxAdView?>(null)
    var applovinVideoAd by mutableStateOf<MaxRewardedAd?>(null)
    private var retryAttempt = 0.0


   private fun initializeAppLovinAds(context: Context){

       CoroutineScope(Dispatchers.Main).launch {
           // Create the initialization configuration
            val initConfig = AppLovinSdkInitializationConfiguration.builder(ObjectsIds.APPLOVIN_SDK_KEY,context)
               .setMediationProvider(AppLovinMediationProvider.MAX)
               .build()


           // Initialize the SDK with the configuration
           AppLovinSdk.getInstance(context).initialize(initConfig) { sdkConfig ->
               // Start loading ads
               // Start loading the banner ad after SDK is initialized
               loadAppLovinBannerAd(context)

               loadAppLovinVideoAd(context)
           }

       }
   }


    private fun loadAppLovinBannerAd(context: Context) {
        applovinBannerAdView = MaxAdView(ObjectsIds.APPLOVIN_BANNER_AD_ID, context)
    }

    private fun loadAppLovinVideoAd(context: Context) {
        // Initialize the rewarded ad
        applovinVideoAd = MaxRewardedAd.getInstance(ObjectsIds.APPLOVIN_VIDEO_AD_ID, context).apply {
            setListener(object : MaxRewardedAdListener {
                override fun onAdLoaded(maxAd: MaxAd) {
                    // Ad successfully loaded, reset retry attempts
                    retryAttempt = 0.0
                    Log.d("RewardedAd", "Ad loaded")
                }

                override fun onAdDisplayed(maxAd: MaxAd) {
                    Log.d("RewardedAd", "Ad displayed")
                }

                override fun onAdClicked(maxAd: MaxAd) {
                    Log.d("RewardedAd", "Ad clicked")
                }

                override fun onAdLoadFailed(p0: String, p1: MaxError) {

                    // Ad failed to load, retry with exponential backoff
                    retryAttempt++
                    val delayMillis = TimeUnit.SECONDS.toMillis(
                        2.0.pow(6.0.coerceAtMost(retryAttempt)).toLong()
                    )
                    Log.d("RewardedAd", "Ad failed to load, retrying in $delayMillis ms")

                    Handler(Looper.getMainLooper()).postDelayed({
                        applovinVideoAd?.loadAd()
                    }, delayMillis)
                }

                override fun onAdDisplayFailed(p0: MaxAd, p1: MaxError) {
                    // Ad failed to display, load the next ad
                    Log.d("RewardedAd", "Ad failed to display")
                    applovinVideoAd?.loadAd()
                }

                override fun onAdHidden(maxAd: MaxAd) {
                    // Ad hidden, preload the next ad
                    Log.d("RewardedAd", "Ad hidden, preloading next ad")
                    applovinVideoAd?.loadAd()
                }

                override fun onUserRewarded(maxAd: MaxAd, maxReward: MaxReward) {
                    // User has earned the reward
                    Log.d("RewardedAd", "User rewarded with: ${maxReward.amount} ${maxReward.label}")

                    coinClaimed += 1

                }
            })

            // Load the initial ad
            loadAd()

        }

    }




}



