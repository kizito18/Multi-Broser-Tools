package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.viewModelAndWebViewHolder

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.my.Zitos.MultiBroser.Tools.ValuesHolderForAutoRefreshActivityMainScreen
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class BrowserAutoRefreshViewModelFactory(
    private val context: Context
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BrowserAutoRefreshViewModel::class.java)) {
            return BrowserAutoRefreshViewModel(SavedStateHandle(),context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}




class BrowserAutoRefreshViewModel(
    savedStateHandle: SavedStateHandle,
    context: Context
) : ViewModel()
{



    private val _passedValuesForInteraction  = MutableStateFlow(savedStateHandle["passed_value_class_inside_ViewModel"]
        ?: ValuesHolderForAutoRefreshActivityMainScreen()
    )
    val passedValuesForInteraction: StateFlow<ValuesHolderForAutoRefreshActivityMainScreen> =
        _passedValuesForInteraction.asStateFlow()




    //for web1

    private val _webViewHolder1 = MutableStateFlow(savedStateHandle["webViewHolder1_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder1: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder1.asStateFlow()





    //for web2
    private val _webViewHolder2 = MutableStateFlow(savedStateHandle["webViewHolder2_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder2: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder2.asStateFlow()



    //for web3
    private val _webViewHolder3 = MutableStateFlow(savedStateHandle["webViewHolder3_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder3: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder3.asStateFlow()



    //for web4
    private val _webViewHolder4 = MutableStateFlow(savedStateHandle["webViewHolder4_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder4: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder4.asStateFlow()




    //for web5
    private val _webViewHolder5 = MutableStateFlow(savedStateHandle["webViewHolder5_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder5: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder5.asStateFlow()




    //for web6
    private val _webViewHolder6 = MutableStateFlow(savedStateHandle["webViewHolder6_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder6: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder6.asStateFlow()



    //for web7
    private val _webViewHolder7 = MutableStateFlow(savedStateHandle["webViewHolder7_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder7: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder7.asStateFlow()



    //for web8
    private val _webViewHolder8 = MutableStateFlow(savedStateHandle["webViewHolder8_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder8: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder8.asStateFlow()



    //for web9
    private val _webViewHolder9 = MutableStateFlow(savedStateHandle["webViewHolder9_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder9: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder9.asStateFlow()




    //for web10
    private val _webViewHolder10 = MutableStateFlow(savedStateHandle["webViewHolder10_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder10: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder10.asStateFlow()



    //for web11
    private val _webViewHolder11 = MutableStateFlow(savedStateHandle["webViewHolder11_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder11: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder11.asStateFlow()




    //for web12
    private val _webViewHolder12 = MutableStateFlow(savedStateHandle["webViewHolder12_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder12: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder12.asStateFlow()




    //for web13
    private val _webViewHolder13 = MutableStateFlow(savedStateHandle["webViewHolder13_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder13: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder13.asStateFlow()





    //for web14
    private val _webViewHolder14 = MutableStateFlow(savedStateHandle["webViewHolder14_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder14: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder14.asStateFlow()





    //for web15
    private val _webViewHolder15 = MutableStateFlow(savedStateHandle["webViewHolder15_class__inside_ViewModel"]
        ?: WebViewHolderForAutoRefresh(context)
    )
    val webViewHolder15: StateFlow<WebViewHolderForAutoRefresh> = _webViewHolder15.asStateFlow()


}

