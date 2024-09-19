package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb10SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb11SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb12SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb13SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb14SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb15SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb1SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb2SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb3SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb4SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb5SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb6SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb7SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb8SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb9SpForWebAutoScroll

suspend fun  changeIncognitoModeInSharedPrefForWebScroll(
    context: Context,
    webNum: Int,
    incognitoMode: Boolean
) {


    if (webNum == 1) {
        setIncognitoModeForWeb1SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 2) {
        setIncognitoModeForWeb2SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 3) {
        setIncognitoModeForWeb3SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 4) {
        setIncognitoModeForWeb4SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 5) {
        setIncognitoModeForWeb5SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 6) {
        setIncognitoModeForWeb6SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 7) {
        setIncognitoModeForWeb7SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 8) {
        setIncognitoModeForWeb8SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 9) {
        setIncognitoModeForWeb9SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 10) {
        setIncognitoModeForWeb10SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 11) {
        setIncognitoModeForWeb11SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 12) {
        setIncognitoModeForWeb12SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 13) {
        setIncognitoModeForWeb13SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 14) {
        setIncognitoModeForWeb14SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

    if (webNum == 15) {
        setIncognitoModeForWeb15SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    }

}