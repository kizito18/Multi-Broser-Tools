package com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb10SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb11SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb12SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb13SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb14SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb15SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb1SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb2SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb3SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb4SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb5SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb6SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb7SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb8SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setAdBlockerModeForWeb9SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb10SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb11SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb12SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb13SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb14SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb15SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb1SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb2SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb3SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb4SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb5SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb6SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb7SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb8SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setIncognitoModeForWeb9SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb10SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb11SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb12SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb13SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb14SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb15SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb1SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb2SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb3SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb4SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb5SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb6SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb7SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb8SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setPcModeForWeb9SpForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView10UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView11UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView12UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView13UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView14UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView15UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView1UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView2UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView3UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView4UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView5UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView6UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView7UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView8UrlPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref.setWebView9UrlPrefForWebNormal


suspend fun changeAllValueInAllWebViewNormalInSharedPref(
    context: Context,
    url: String,
    pcMode: Boolean,
    incognitoMode: Boolean,
    adBlockerMode:Boolean
) {

    setWebView1UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb1SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb1SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb1SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView2UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb2SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb2SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb2SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView3UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb3SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb3SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb3SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView4UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb4SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb4SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb4SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView5UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb5SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb5SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb5SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView6UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb6SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb6SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb6SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)




    setWebView7UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb7SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb7SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb7SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)




    setWebView8UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb8SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb8SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb8SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)




    setWebView9UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb9SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb9SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb9SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView10UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb10SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb10SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb10SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)




    setWebView11UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb11SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb11SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb11SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)




    setWebView12UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb12SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb12SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb12SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)




    setWebView13UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb13SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb13SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb13SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView14UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb14SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb14SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb14SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)





    setWebView15UrlPrefForWebNormal(
        url = url,
        dataStore = context.dataStoreForWebNormal
    )

    setPcModeForWeb15SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    setIncognitoModeForWeb15SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    setAdBlockerModeForWeb15SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)



}

