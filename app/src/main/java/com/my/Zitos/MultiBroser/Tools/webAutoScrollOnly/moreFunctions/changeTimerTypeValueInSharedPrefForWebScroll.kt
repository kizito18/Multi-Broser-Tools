package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb10PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb11PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb12PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb13PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb14PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb15PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb1PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb2PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb3PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb4PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb5PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb6PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb7PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb8PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb9PrefForWebAutoScroll


suspend fun changeTimerTypeValueInSharedPrefForWebScroll(
    context: Context,
    webNum: Int,
    timerType: TimerType,


    ) {


    if (webNum == 1) {
    setTimerTypeForWeb1PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
}

    if (webNum == 2) {
        setTimerTypeForWeb2PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 3) {
        setTimerTypeForWeb3PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 4) {
        setTimerTypeForWeb4PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 5) {
        setTimerTypeForWeb5PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 6) {
        setTimerTypeForWeb6PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 7) {
        setTimerTypeForWeb7PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 8) {
        setTimerTypeForWeb8PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 9) {
        setTimerTypeForWeb9PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 10) {
        setTimerTypeForWeb10PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 11) {
        setTimerTypeForWeb11PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 12) {
        setTimerTypeForWeb12PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 13) {
        setTimerTypeForWeb13PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 14) {
        setTimerTypeForWeb14PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}

    if (webNum == 15) {
        setTimerTypeForWeb15PrefForWebAutoScroll(
            timerType = timerType,
            dataStore = context.dataStoreForWebAutoScroll
        )
}



}