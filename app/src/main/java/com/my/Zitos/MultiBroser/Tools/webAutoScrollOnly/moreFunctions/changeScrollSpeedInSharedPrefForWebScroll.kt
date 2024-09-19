package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9ScrollSpeedPref

suspend fun changeScrollSpeedInSharedPrefForWebScroll (
    context:
    Context, webNum: Int,
    speedSelected: Int
) {


    if (webNum == 1) {
        setWebView1ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 2) {
        setWebView2ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 3) {
        setWebView3ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 4) {
        setWebView4ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 5) {
        setWebView5ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 6) {
        setWebView6ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 7) {
        setWebView7ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 8) {
        setWebView8ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 9) {
        setWebView9ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 10) {
        setWebView10ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 11) {
        setWebView11ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 12) {
        setWebView12ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 13) {
        setWebView13ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 14) {
        setWebView14ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 15) {
        setWebView15ScrollSpeedPref(
            speed = speedSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }



}