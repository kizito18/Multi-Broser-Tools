package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb10Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb11Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb12Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb13Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb14Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb15Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb1Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb2Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb3Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb4Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb5Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb6Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb7Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb8Pref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setTimerTypeForWeb9Pref


suspend fun changeTimerTypeValueInSharedPrefForWebRefresh(
    context: Context,
    webNum: Int,
    timerType: TimerType,


    ) {


    if (webNum == 1) {
    setTimerTypeForWeb1Pref(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoRefresh
    )
}

    if (webNum == 2) {
        setTimerTypeForWeb2Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 3) {
        setTimerTypeForWeb3Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 4) {
        setTimerTypeForWeb4Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 5) {
        setTimerTypeForWeb5Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 6) {
        setTimerTypeForWeb6Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 7) {
        setTimerTypeForWeb7Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 8) {
        setTimerTypeForWeb8Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 9) {
        setTimerTypeForWeb9Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 10) {
        setTimerTypeForWeb10Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 11) {
        setTimerTypeForWeb11Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 12) {
        setTimerTypeForWeb12Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 13) {
        setTimerTypeForWeb13Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 14) {
        setTimerTypeForWeb14Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}

    if (webNum == 15) {
        setTimerTypeForWeb15Pref(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoRefresh
        )
}



}