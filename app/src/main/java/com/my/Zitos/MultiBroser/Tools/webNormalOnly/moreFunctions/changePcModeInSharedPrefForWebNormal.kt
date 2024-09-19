package com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebNormal
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

suspend fun changePcModeInSharedPrefForWebNormal(
    context: Context,
    webNum: Int,
    pcMode: Boolean
) {


    if (webNum == 1) {
        setPcModeForWeb1SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 2) {
        setPcModeForWeb2SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 3) {
        setPcModeForWeb3SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 4) {
        setPcModeForWeb4SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 5) {
        setPcModeForWeb5SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 6) {
        setPcModeForWeb6SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 7) {
        setPcModeForWeb7SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 8) {
        setPcModeForWeb8SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 9) {
        setPcModeForWeb9SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 10) {
        setPcModeForWeb10SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 11) {
        setPcModeForWeb11SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 12) {
        setPcModeForWeb12SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 13) {
        setPcModeForWeb13SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 14) {
        setPcModeForWeb14SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 15) {
        setPcModeForWeb15SpForWebNormal(pcModeValue = pcMode, dataStore = context.dataStoreForWebNormal)
    }



}