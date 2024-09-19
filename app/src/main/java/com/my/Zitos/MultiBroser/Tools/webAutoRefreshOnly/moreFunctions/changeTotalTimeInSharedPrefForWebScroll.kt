package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView10TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView11TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView12TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView13TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView14TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView15TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView1TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView2TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView3TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView4TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView5TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView6TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView7TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView8TotalTimerPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView9TotalTimerPref

suspend fun changeTotalTimeInSharedPrefForWebRefresh (
    context:
    Context, webNum: Int,
    timeSelected: Int
) {


    if (webNum == 1) {
        setWebView1TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 2) {
        setWebView2TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 3) {
        setWebView3TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 4) {
        setWebView4TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 5) {
        setWebView5TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 6) {
        setWebView6TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 7) {
        setWebView7TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 8) {
        setWebView8TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 9) {
        setWebView9TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 10) {
        setWebView10TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 11) {
        setWebView11TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 12) {
        setWebView12TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 13) {
        setWebView13TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 14) {
        setWebView14TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 15) {
        setWebView15TotalTimerPref(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }



}