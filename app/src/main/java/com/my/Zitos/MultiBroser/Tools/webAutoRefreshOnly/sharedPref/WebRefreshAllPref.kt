package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref

import androidx.datastore.core.DataStore
import com.my.Zitos.MultiBroser.Tools.TimerType
import kotlinx.serialization.Serializable




@Serializable
data class WebRefreshAllPref(

    val web1AutoRefreshUrl : String = "",
    val web2AutoRefreshUrl : String = "",
    val web3AutoRefreshUrl : String = "",
    val web4AutoRefreshUrl : String = "",
    val web5AutoRefreshUrl : String = "",
    val web6AutoRefreshUrl : String = "",
    val web7AutoRefreshUrl : String = "",
    val web8AutoRefreshUrl : String = "",
    val web9AutoRefreshUrl : String = "",
    val web10AutoRefreshUrl : String = "",
    val web11AutoRefreshUrl : String = "",
    val web12AutoRefreshUrl : String = "",
    val web13AutoRefreshUrl : String = "",
    val web14AutoRefreshUrl : String = "",
    val web15AutoRefreshUrl : String = "",


    val web1TotalTimer : Int = 0,
    val web2TotalTimer : Int = 0,
    val web3TotalTimer : Int = 0,
    val web4TotalTimer : Int = 0,
    val web5TotalTimer : Int = 0,
    val web6TotalTimer : Int = 0,
    val web7TotalTimer : Int = 0,
    val web8TotalTimer : Int = 0,
    val web9TotalTimer : Int = 0,
    val web10TotalTimer : Int = 0,
    val web11TotalTimer : Int = 0,
    val web12TotalTimer : Int = 0,
    val web13TotalTimer : Int = 0,
    val web14TotalTimer : Int = 0,
    val web15TotalTimer : Int = 0,



    val timerTypeForWeb1 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb2 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb3 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb4 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb5 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb6 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb7 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb8 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb9 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb10 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb11 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb12 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb13 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb14 : TimerType = TimerType.MINUTES,
    val timerTypeForWeb15 : TimerType = TimerType.MINUTES,


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







suspend fun setWebView1UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView2UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView3UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView4UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView5UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView6UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView7UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView8UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView9UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView10UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView11UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView12UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView13UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView14UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14AutoRefreshUrl = url
        )
    }
}
suspend fun setWebView15UrlPref(url: String, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15AutoRefreshUrl = url
        )
    }
}






suspend fun setWebView1TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1TotalTimer = timer
        )
    }
}
suspend fun setWebView2TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2TotalTimer = timer
        )
    }
}
suspend fun setWebView3TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3TotalTimer = timer
        )
    }
}
suspend fun setWebView4TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4TotalTimer = timer
        )
    }
}
suspend fun setWebView5TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5TotalTimer = timer
        )
    }
}
suspend fun setWebView6TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6TotalTimer = timer
        )
    }
}
suspend fun setWebView7TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7TotalTimer = timer
        )
    }
}
suspend fun setWebView8TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8TotalTimer = timer
        )
    }
}
suspend fun setWebView9TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9TotalTimer = timer
        )
    }
}
suspend fun setWebView10TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10TotalTimer = timer
        )
    }
}
suspend fun setWebView11TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11TotalTimer = timer
        )
    }
}
suspend fun setWebView12TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12TotalTimer = timer
        )
    }
}
suspend fun setWebView13TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13TotalTimer = timer
        )
    }
}
suspend fun setWebView14TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14TotalTimer = timer
        )
    }
}
suspend fun setWebView15TotalTimerPref(timer: Int, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15TotalTimer = timer
        )
    }
}






suspend fun setTimerTypeForWeb1Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb1 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb2Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb2 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb3Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb3 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb4Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb4 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb5Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb5 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb6Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb6 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb7Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb7 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb8Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb8 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb9Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb9 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb10Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb10 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb11Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb11 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb12Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb12 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb13Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb13 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb14Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb14 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb15Pref(timerType: TimerType, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb15 = timerType
        )
    }
}





suspend fun setWeb1CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox1 = boxValue
        )
    }
}
suspend fun setWeb2CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox2 = boxValue
        )
    }
}
suspend fun setWeb3CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox3 = boxValue
        )
    }
}
suspend fun setWeb4CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox4 = boxValue
        )
    }
}
suspend fun setWeb5CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox5 = boxValue
        )
    }
}
suspend fun setWeb6CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox6 = boxValue
        )
    }
}
suspend fun setWeb7CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox7 = boxValue
        )
    }
}
suspend fun setWeb8CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox8 = boxValue
        )
    }
}
suspend fun setWeb9CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox9 = boxValue
        )
    }
}
suspend fun setWeb10CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox10 = boxValue
        )
    }
}
suspend fun setWeb11CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox11 = boxValue
        )
    }
}
suspend fun setWeb12CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox12 = boxValue
        )
    }
}

suspend fun setWeb13CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox13 = boxValue
        )
    }
}

suspend fun setWeb14CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox14 = boxValue
        )
    }
}
suspend fun setWeb15CheckedForSp(boxValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox15 = boxValue
        )
    }
}






suspend fun setPcModeForWeb1Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb1 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb2Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb2 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb3Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb3 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb4Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb4 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb5Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb5 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb6Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb6 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb7Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb7 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb8Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb8 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb9Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb9 = pcModeValue
        )
    }
}

suspend fun setPcModeForWeb10Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb10 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb11Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb11 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb12Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb12 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb13Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb13 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb14Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb14 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb15Sp(pcModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb15 = pcModeValue
        )
    }
}






suspend fun setIncognitoModeForWeb1Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb1 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb2Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb2 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb3Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb3 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb4Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb4 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb5Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb5 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb6Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb6 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb7Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb7 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb8Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb8 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb9Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb9 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb10Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb10 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb11Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb11 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb12Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb12 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb13Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb13 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb14Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb14 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb15Sp(incognitoModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb15 = incognitoModeValue
        )
    }
}






suspend fun setAdBlockerModeForWeb1Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb1 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb2Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb2 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb3Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb3 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb4Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb4 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb5Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb5 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb6Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb6 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb7Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb7 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb8Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb8 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb9Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb9 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb10Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb10 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb11Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb11 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb12Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb12 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb13Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb13 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb14Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb14 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb15Sp(adBlockerModeValue: Boolean, dataStore: DataStore<WebRefreshAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb15 = adBlockerModeValue
        )
    }
}