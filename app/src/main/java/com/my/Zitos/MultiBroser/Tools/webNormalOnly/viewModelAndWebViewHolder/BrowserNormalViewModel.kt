package com.my.Zitos.MultiBroser.Tools.webNormalOnly.viewModelAndWebViewHolder

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.my.Zitos.MultiBroser.Tools.ValuesHolderForBrowserNormalActivityMainScreen
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class BrowserNormalViewModelFactory(
    private val context: Context
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BrowserNormalViewModel::class.java)) {
            return BrowserNormalViewModel(SavedStateHandle(),context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}




class BrowserNormalViewModel(
    savedStateHandle: SavedStateHandle,
    context: Context
) : ViewModel()
{



    private val _passedValuesForInteraction  = MutableStateFlow(savedStateHandle["passed_value_class_inside_ViewModel"]
        ?: ValuesHolderForBrowserNormalActivityMainScreen()
    )
    val passedValuesForInteraction: StateFlow<ValuesHolderForBrowserNormalActivityMainScreen> =
        _passedValuesForInteraction.asStateFlow()




    //for web1

    private val _webViewHolder1 = MutableStateFlow(savedStateHandle["webViewHolder1_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder1: StateFlow<WebViewHolderForWebNormal> = _webViewHolder1.asStateFlow()





    //for web2
    private val _webViewHolder2 = MutableStateFlow(savedStateHandle["webViewHolder2_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder2: StateFlow<WebViewHolderForWebNormal> = _webViewHolder2.asStateFlow()



    //for web3
    private val _webViewHolder3 = MutableStateFlow(savedStateHandle["webViewHolder3_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder3: StateFlow<WebViewHolderForWebNormal> = _webViewHolder3.asStateFlow()



    //for web4
    private val _webViewHolder4 = MutableStateFlow(savedStateHandle["webViewHolder4_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder4: StateFlow<WebViewHolderForWebNormal> = _webViewHolder4.asStateFlow()




    //for web5
    private val _webViewHolder5 = MutableStateFlow(savedStateHandle["webViewHolder5_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder5: StateFlow<WebViewHolderForWebNormal> = _webViewHolder5.asStateFlow()




    //for web6
    private val _webViewHolder6 = MutableStateFlow(savedStateHandle["webViewHolder6_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder6: StateFlow<WebViewHolderForWebNormal> = _webViewHolder6.asStateFlow()



    //for web7
    private val _webViewHolder7 = MutableStateFlow(savedStateHandle["webViewHolder7_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder7: StateFlow<WebViewHolderForWebNormal> = _webViewHolder7.asStateFlow()



    //for web8
    private val _webViewHolder8 = MutableStateFlow(savedStateHandle["webViewHolder8_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder8: StateFlow<WebViewHolderForWebNormal> = _webViewHolder8.asStateFlow()



    //for web9
    private val _webViewHolder9 = MutableStateFlow(savedStateHandle["webViewHolder9_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder9: StateFlow<WebViewHolderForWebNormal> = _webViewHolder9.asStateFlow()




    //for web10
    private val _webViewHolder10 = MutableStateFlow(savedStateHandle["webViewHolder10_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder10: StateFlow<WebViewHolderForWebNormal> = _webViewHolder10.asStateFlow()



    //for web11
    private val _webViewHolder11 = MutableStateFlow(savedStateHandle["webViewHolder11_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder11: StateFlow<WebViewHolderForWebNormal> = _webViewHolder11.asStateFlow()




    //for web12
    private val _webViewHolder12 = MutableStateFlow(savedStateHandle["webViewHolder12_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder12: StateFlow<WebViewHolderForWebNormal> = _webViewHolder12.asStateFlow()




    //for web13
    private val _webViewHolder13 = MutableStateFlow(savedStateHandle["webViewHolder13_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder13: StateFlow<WebViewHolderForWebNormal> = _webViewHolder13.asStateFlow()





    //for web14
    private val _webViewHolder14 = MutableStateFlow(savedStateHandle["webViewHolder14_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder14: StateFlow<WebViewHolderForWebNormal> = _webViewHolder14.asStateFlow()





    //for web15
    private val _webViewHolder15 = MutableStateFlow(savedStateHandle["webViewHolder15_class__inside_ViewModel"]
        ?: WebViewHolderForWebNormal(context)
    )
    val webViewHolder15: StateFlow<WebViewHolderForWebNormal> = _webViewHolder15.asStateFlow()


}

