package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9WebLengthPref

suspend fun changeWebLengthInSharedPrefForWebScroll (
    context:
    Context, webNum: Int,
    webLengthSelected: Int
) {


    if (webNum == 1) {
        setWebView1WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 2) {
        setWebView2WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 3) {
        setWebView3WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 4) {
        setWebView4WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 5) {
        setWebView5WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 6) {
        setWebView6WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 7) {
        setWebView7WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 8) {
        setWebView8WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 9) {
        setWebView9WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 10) {
        setWebView10WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 11) {
        setWebView11WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 12) {
        setWebView12WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 13) {
        setWebView13WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 14) {
        setWebView14WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }

    if (webNum == 15) {
        setWebView15WebLengthPref(
            length = webLengthSelected,
            dataStore = context.dataStoreForWebAutoScroll
        )
    }



}