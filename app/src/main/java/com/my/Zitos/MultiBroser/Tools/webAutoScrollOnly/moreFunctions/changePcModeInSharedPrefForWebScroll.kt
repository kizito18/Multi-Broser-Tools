package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb10SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb11SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb12SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb13SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb14SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb15SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb1SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb2SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb3SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb4SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb5SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb6SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb7SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb8SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb9SpForWebAutoScroll

suspend fun changePcModeInSharedPrefForWebScroll(
    context: Context,
    webNum: Int,
    pcMode: Boolean
) {


    if (webNum == 1) {
        setPcModeForWeb1SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 2) {
        setPcModeForWeb2SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 3) {
        setPcModeForWeb3SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 4) {
        setPcModeForWeb4SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 5) {
        setPcModeForWeb5SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 6) {
        setPcModeForWeb6SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 7) {
        setPcModeForWeb7SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 8) {
        setPcModeForWeb8SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 9) {
        setPcModeForWeb9SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 10) {
        setPcModeForWeb10SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 11) {
        setPcModeForWeb11SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 12) {
        setPcModeForWeb12SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 13) {
        setPcModeForWeb13SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 14) {
        setPcModeForWeb14SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 15) {
        setPcModeForWeb15SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    }



}