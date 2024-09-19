package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb10SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb11SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb12SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb13SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb14SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb15SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb1SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb2SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb3SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb4SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb5SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb6SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb7SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb8SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb9SpForWebAutoScroll

suspend fun changeAdBlockerModeInSharedPrefForWebScroll(
    context: Context,
    webNum: Int,
    adBlockerMode: Boolean
) {


    if (webNum == 1) {
        setAdBlockerModeForWeb1SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 2) {
        setAdBlockerModeForWeb2SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 3) {
        setAdBlockerModeForWeb3SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 4) {
        setAdBlockerModeForWeb4SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 5) {
        setAdBlockerModeForWeb5SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 6) {
        setAdBlockerModeForWeb6SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 7) {
        setAdBlockerModeForWeb7SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 8) {
        setAdBlockerModeForWeb8SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 9) {
        setAdBlockerModeForWeb9SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 10) {
        setAdBlockerModeForWeb10SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 11) {
        setAdBlockerModeForWeb11SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 12) {
        setAdBlockerModeForWeb12SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 13) {
        setAdBlockerModeForWeb13SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 14) {
        setAdBlockerModeForWeb14SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 15) {
        setAdBlockerModeForWeb15SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)
    }

}