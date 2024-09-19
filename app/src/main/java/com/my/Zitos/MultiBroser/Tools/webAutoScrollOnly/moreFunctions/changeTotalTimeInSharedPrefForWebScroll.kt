package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9TotalTimerPrefForWebAutoScroll

suspend fun changeTotalTimeInSharedPrefForWebScroll(
    context:
    Context, webNum: Int,
    timeSelected: Int
) {


    if (webNum == 1) {
        setWebView1TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 2) {
        setWebView2TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 3) {
        setWebView3TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 4) {
        setWebView4TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 5) {
        setWebView5TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 6) {
        setWebView6TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 7) {
        setWebView7TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 8) {
        setWebView8TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 9) {
        setWebView9TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 10) {
        setWebView10TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 11) {
        setWebView11TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 12) {
        setWebView12TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 13) {
        setWebView13TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 14) {
        setWebView14TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 15) {
        setWebView15TotalTimerPrefForWebAutoScroll(
            timer = timeSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }



}