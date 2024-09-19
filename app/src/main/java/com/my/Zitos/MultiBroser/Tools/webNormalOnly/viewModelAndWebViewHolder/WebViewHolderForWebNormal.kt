package com.my.Zitos.MultiBroser.Tools.webNormalOnly.viewModelAndWebViewHolder

import android.content.Context
import android.webkit.WebView
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.my.Zitos.MultiBroser.Tools.WebControllerType


class WebViewHolderForWebNormal (context: Context){


    val webView by mutableStateOf<WebView>(WebView(context))


    var webController by mutableStateOf(WebControllerType.DO_NOTING)

    var webViewUrl by mutableStateOf<String?>(null)

    var webProgressValue by mutableIntStateOf(0)



    var isPcModeActive by mutableStateOf<Boolean?>(null)
    var isAdBlockerActive by mutableStateOf<Boolean?>(null)
    var isIncognitoActive by mutableStateOf<Boolean?>(null)


}
