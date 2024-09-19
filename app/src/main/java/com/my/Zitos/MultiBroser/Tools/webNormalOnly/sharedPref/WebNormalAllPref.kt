package com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref

import androidx.datastore.core.DataStore
import kotlinx.serialization.Serializable




@Serializable
data class WebNormalAllPref(

    val web1Url : String = "",
    val web2Url : String = "",
    val web3Url : String = "",
    val web4Url : String = "",
    val web5Url : String = "",
    val web6Url : String = "",
    val web7Url : String = "",
    val web8Url : String = "",
    val web9Url : String = "",
    val web10Url : String = "",
    val web11Url : String = "",
    val web12Url : String = "",
    val web13Url : String = "",
    val web14Url : String = "",
    val web15Url : String = "",



    val checkBox1: Boolean? =  null,
    val checkBox2: Boolean? =  null,
    val checkBox3: Boolean? =  null,
    val checkBox4: Boolean? =  null,
    val checkBox5: Boolean? =  null,
    val checkBox6: Boolean? =  null,
    val checkBox7: Boolean? =  null,
    val checkBox8: Boolean? =  null,
    val checkBox9: Boolean? =  null,
    val checkBox10: Boolean? =  null,
    val checkBox11: Boolean? =  null,
    val checkBox12: Boolean? =  null,
    val checkBox13: Boolean? =  null,
    val checkBox14: Boolean? =  null,
    val checkBox15: Boolean? =  null,


    val isPcModeActiveForWeb1: Boolean =  false,
    val isPcModeActiveForWeb2: Boolean =  false,
    val isPcModeActiveForWeb3: Boolean =  false,
    val isPcModeActiveForWeb4: Boolean =  false,
    val isPcModeActiveForWeb5: Boolean =  false,
    val isPcModeActiveForWeb6: Boolean =  false,
    val isPcModeActiveForWeb7: Boolean =  false,
    val isPcModeActiveForWeb8: Boolean =  false,
    val isPcModeActiveForWeb9: Boolean =  false,
    val isPcModeActiveForWeb10: Boolean =  false,
    val isPcModeActiveForWeb11: Boolean =  false,
    val isPcModeActiveForWeb12: Boolean =  false,
    val isPcModeActiveForWeb13: Boolean =  false,
    val isPcModeActiveForWeb14: Boolean =  false,
    val isPcModeActiveForWeb15: Boolean =  false,


    val isIncognitoActiveForWeb1: Boolean =  false,
    val isIncognitoActiveForWeb2: Boolean =  false,
    val isIncognitoActiveForWeb3: Boolean =  false,
    val isIncognitoActiveForWeb4: Boolean =  false,
    val isIncognitoActiveForWeb5: Boolean =  false,
    val isIncognitoActiveForWeb6: Boolean =  false,
    val isIncognitoActiveForWeb7: Boolean =  false,
    val isIncognitoActiveForWeb8: Boolean =  false,
    val isIncognitoActiveForWeb9: Boolean =  false,
    val isIncognitoActiveForWeb10: Boolean =  false,
    val isIncognitoActiveForWeb11: Boolean =  false,
    val isIncognitoActiveForWeb12: Boolean =  false,
    val isIncognitoActiveForWeb13: Boolean =  false,
    val isIncognitoActiveForWeb14: Boolean =  false,
    val isIncognitoActiveForWeb15: Boolean =  false,


    val isAdBlockerActiveForWeb1: Boolean =  false,
    val isAdBlockerActiveForWeb2: Boolean =  false,
    val isAdBlockerActiveForWeb3: Boolean =  false,
    val isAdBlockerActiveForWeb4: Boolean =  false,
    val isAdBlockerActiveForWeb5: Boolean =  false,
    val isAdBlockerActiveForWeb6: Boolean =  false,
    val isAdBlockerActiveForWeb7: Boolean =  false,
    val isAdBlockerActiveForWeb8: Boolean =  false,
    val isAdBlockerActiveForWeb9: Boolean =  false,
    val isAdBlockerActiveForWeb10: Boolean =  false,
    val isAdBlockerActiveForWeb11: Boolean =  false,
    val isAdBlockerActiveForWeb12: Boolean =  false,
    val isAdBlockerActiveForWeb13: Boolean =  false,
    val isAdBlockerActiveForWeb14: Boolean =  false,
    val isAdBlockerActiveForWeb15: Boolean =  false




)







suspend fun setWebView1UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1Url = url
        )
    }
}
suspend fun setWebView2UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2Url = url
        )
    }
}
suspend fun setWebView3UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3Url = url
        )
    }
}
suspend fun setWebView4UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4Url = url
        )
    }
}
suspend fun setWebView5UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5Url = url
        )
    }
}
suspend fun setWebView6UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6Url = url
        )
    }
}
suspend fun setWebView7UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7Url = url
        )
    }
}
suspend fun setWebView8UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8Url = url
        )
    }
}
suspend fun setWebView9UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9Url = url
        )
    }
}
suspend fun setWebView10UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10Url = url
        )
    }
}
suspend fun setWebView11UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11Url = url
        )
    }
}
suspend fun setWebView12UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12Url = url
        )
    }
}
suspend fun setWebView13UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13Url = url
        )
    }
}
suspend fun setWebView14UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14Url = url
        )
    }
}
suspend fun setWebView15UrlPrefForWebNormal(url: String, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15Url = url
        )
    }
}



suspend fun setWeb1CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox1 = boxValue
        )
    }
}
suspend fun setWeb2CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox2 = boxValue
        )
    }
}
suspend fun setWeb3CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox3 = boxValue
        )
    }
}
suspend fun setWeb4CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox4 = boxValue
        )
    }
}
suspend fun setWeb5CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox5 = boxValue
        )
    }
}
suspend fun setWeb6CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox6 = boxValue
        )
    }
}
suspend fun setWeb7CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox7 = boxValue
        )
    }
}
suspend fun setWeb8CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox8 = boxValue
        )
    }
}
suspend fun setWeb9CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox9 = boxValue
        )
    }
}
suspend fun setWeb10CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox10 = boxValue
        )
    }
}
suspend fun setWeb11CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox11 = boxValue
        )
    }
}
suspend fun setWeb12CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox12 = boxValue
        )
    }
}

suspend fun setWeb13CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox13 = boxValue
        )
    }
}

suspend fun setWeb14CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox14 = boxValue
        )
    }
}
suspend fun setWeb15CheckedForSpForWebNormal(boxValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox15 = boxValue
        )
    }
}






suspend fun setPcModeForWeb1SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb1 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb2SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb2 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb3SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb3 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb4SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb4 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb5SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb5 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb6SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb6 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb7SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb7 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb8SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb8 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb9SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb9 = pcModeValue
        )
    }
}

suspend fun setPcModeForWeb10SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb10 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb11SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb11 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb12SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb12 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb13SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb13 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb14SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb14 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb15SpForWebNormal(pcModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb15 = pcModeValue
        )
    }
}






suspend fun setIncognitoModeForWeb1SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb1 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb2SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb2 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb3SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb3 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb4SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb4 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb5SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb5 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb6SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb6 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb7SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb7 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb8SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb8 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb9SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb9 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb10SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb10 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb11SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb11 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb12SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb12 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb13SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb13 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb14SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb14 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb15SpForWebNormal(incognitoModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb15 = incognitoModeValue
        )
    }
}






suspend fun setAdBlockerModeForWeb1SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb1 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb2SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb2 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb3SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb3 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb4SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb4 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb5SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb5 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb6SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb6 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb7SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb7 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb8SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb8 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb9SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb9 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb10SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb10 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb11SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb11 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb12SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb12 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb13SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb13 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb14SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb14 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb15SpForWebNormal(adBlockerModeValue: Boolean, dataStore: DataStore<WebNormalAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb15 = adBlockerModeValue
        )
    }
}