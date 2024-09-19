package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView10UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView11UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView12UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView13UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView14UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView1UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView2UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView3UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView4UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView5UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView6UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView7UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView8UrlPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref.setWebView9UrlPref


suspend fun changeUrlValueInSharedPrefForWebRefresh(
    context: Context,
    webNum: Int,
    url: String
) {


    if (webNum == 1) {
        setWebView1UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 2) {
        setWebView2UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 3) {
        setWebView3UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 4) {
        setWebView4UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 5) {
        setWebView5UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 6) {
        setWebView6UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 7) {
        setWebView7UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 8) {
        setWebView8UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 9) {
        setWebView9UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 10) {
        setWebView10UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 11) {
        setWebView11UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 12) {
        setWebView12UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 13) {
        setWebView13UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 14) {
        setWebView14UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }

    if (webNum == 15) {
        setWebView1UrlPref(
            url = url,
            dataStore = context.dataStoreForWebAutoRefresh
        )
    }



}
