package com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebNormal
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

suspend fun  changeIncognitoModeInSharedPrefForWebNormal(
    context: Context,
    webNum: Int,
    incognitoMode: Boolean
) {


    if (webNum == 1) {
        setIncognitoModeForWeb1SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 2) {
        setIncognitoModeForWeb2SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 3) {
        setIncognitoModeForWeb3SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 4) {
        setIncognitoModeForWeb4SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 5) {
        setIncognitoModeForWeb5SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 6) {
        setIncognitoModeForWeb6SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 7) {
        setIncognitoModeForWeb7SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 8) {
        setIncognitoModeForWeb8SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 9) {
        setIncognitoModeForWeb9SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 10) {
        setIncognitoModeForWeb10SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 11) {
        setIncognitoModeForWeb11SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 12) {
        setIncognitoModeForWeb12SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 13) {
        setIncognitoModeForWeb13SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 14) {
        setIncognitoModeForWeb14SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

    if (webNum == 15) {
        setIncognitoModeForWeb15SpForWebNormal(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebNormal)
    }

}