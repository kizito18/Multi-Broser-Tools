package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb10Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb11Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb12Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb13Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb14Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb15Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb1Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb2Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb3Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb4Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb5Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb6Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb7Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb8Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setAdBlockerModeForWeb9Sp

suspend fun changeAdBlockerModeInSharedPrefForWebRefresh(
    context: Context,
    webNum: Int,
    adBlockerMode: Boolean
) {


    if (webNum == 1) {
        setAdBlockerModeForWeb1Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 2) {
        setAdBlockerModeForWeb2Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 3) {
        setAdBlockerModeForWeb3Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 4) {
        setAdBlockerModeForWeb4Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 5) {
        setAdBlockerModeForWeb5Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 6) {
        setAdBlockerModeForWeb6Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 7) {
        setAdBlockerModeForWeb7Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 8) {
        setAdBlockerModeForWeb8Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 9) {
        setAdBlockerModeForWeb9Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 10) {
        setAdBlockerModeForWeb10Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 11) {
        setAdBlockerModeForWeb11Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 12) {
        setAdBlockerModeForWeb12Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 13) {
        setAdBlockerModeForWeb13Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 14) {
        setAdBlockerModeForWeb14Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 15) {
        setAdBlockerModeForWeb15Sp(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

}