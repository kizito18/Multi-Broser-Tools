package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb10Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb11Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb12Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb13Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb14Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb15Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb1Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb2Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb3Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb4Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb5Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb6Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb7Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb8Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setIncognitoModeForWeb9Sp

suspend fun  changeIncognitoModeInSharedPrefForWebRefresh(
    context: Context,
    webNum: Int,
    incognitoMode: Boolean
) {


    if (webNum == 1) {
        setIncognitoModeForWeb1Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 2) {
        setIncognitoModeForWeb2Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 3) {
        setIncognitoModeForWeb3Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 4) {
        setIncognitoModeForWeb4Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 5) {
        setIncognitoModeForWeb5Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 6) {
        setIncognitoModeForWeb6Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 7) {
        setIncognitoModeForWeb7Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 8) {
        setIncognitoModeForWeb8Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 9) {
        setIncognitoModeForWeb9Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 10) {
        setIncognitoModeForWeb10Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 11) {
        setIncognitoModeForWeb11Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 12) {
        setIncognitoModeForWeb12Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 13) {
        setIncognitoModeForWeb13Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 14) {
        setIncognitoModeForWeb14Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 15) {
        setIncognitoModeForWeb15Sp(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

}