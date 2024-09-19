package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb10Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb11Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb12Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb13Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb14Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb15Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb1Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb2Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb3Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb4Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb5Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb6Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb7Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb8Sp
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setPcModeForWeb9Sp

suspend fun changePcModeInSharedPrefForWebRefresh(
    context: Context,
    webNum: Int,
    pcMode: Boolean
) {


    if (webNum == 1) {
        setPcModeForWeb1Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 2) {
        setPcModeForWeb2Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 3) {
        setPcModeForWeb3Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 4) {
        setPcModeForWeb4Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 5) {
        setPcModeForWeb5Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 6) {
        setPcModeForWeb6Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 7) {
        setPcModeForWeb7Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 8) {
        setPcModeForWeb8Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 9) {
        setPcModeForWeb9Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 10) {
        setPcModeForWeb10Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 11) {
        setPcModeForWeb11Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 12) {
        setPcModeForWeb12Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 13) {
        setPcModeForWeb13Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 14) {
        setPcModeForWeb14Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }

    if (webNum == 15) {
        setPcModeForWeb15Sp(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoRefresh)
    }



}