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

suspend fun changeAdBlockerModeInSharedPrefForWebNormal(
    context: Context,
    webNum: Int,
    adBlockerMode: Boolean
) {


    if (webNum == 1) {
        setAdBlockerModeForWeb1SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)

    }

    if (webNum == 2) {
        setAdBlockerModeForWeb2SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 3) {
        setAdBlockerModeForWeb3SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 4) {
        setAdBlockerModeForWeb4SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 5) {
        setAdBlockerModeForWeb5SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 6) {
        setAdBlockerModeForWeb6SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 7) {
        setAdBlockerModeForWeb7SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 8) {
        setAdBlockerModeForWeb8SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 9) {
        setAdBlockerModeForWeb9SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 10) {
        setAdBlockerModeForWeb10SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 11) {
        setAdBlockerModeForWeb11SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 12) {
        setAdBlockerModeForWeb12SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 13) {
        setAdBlockerModeForWeb13SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 14) {
        setAdBlockerModeForWeb14SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 15) {
        setAdBlockerModeForWeb15SpForWebNormal(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebNormal)
    }

}