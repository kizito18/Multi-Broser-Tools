package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref

import androidx.datastore.core.DataStore
import com.my.Zitos.MultiBroser.Tools.TimerType
import kotlinx.serialization.Serializable


@Serializable
data class WebScrollAllPref(

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




    val web1WebLength : Int = 0,
    val web2WebLength : Int = 0,
    val web3WebLength : Int = 0,
    val web4WebLength : Int = 0,
    val web5WebLength : Int = 0,
    val web6WebLength : Int = 0,
    val web7WebLength : Int = 0,
    val web8WebLength : Int = 0,
    val web9WebLength : Int = 0,
    val web10WebLength : Int = 0,
    val web11WebLength : Int = 0,
    val web12WebLength : Int = 0,
    val web13WebLength : Int = 0,
    val web14WebLength : Int = 0,
    val web15WebLength : Int = 0,




    val web1ScrollSpeed : Int = 0,
    val web2ScrollSpeed : Int = 0,
    val web3ScrollSpeed : Int = 0,
    val web4ScrollSpeed : Int = 0,
    val web5ScrollSpeed : Int = 0,
    val web6ScrollSpeed : Int = 0,
    val web7ScrollSpeed : Int = 0,
    val web8ScrollSpeed : Int = 0,
    val web9ScrollSpeed : Int = 0,
    val web10ScrollSpeed : Int = 0,
    val web11ScrollSpeed : Int = 0,
    val web12ScrollSpeed : Int = 0,
    val web13ScrollSpeed : Int = 0,
    val web14ScrollSpeed : Int = 0,
    val web15ScrollSpeed : Int = 0,




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







suspend fun setWebView1UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1Url = url
        )
    }
}
suspend fun setWebView2UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2Url = url
        )
    }
}
suspend fun setWebView3UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3Url = url
        )
    }
}
suspend fun setWebView4UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4Url = url
        )
    }
}
suspend fun setWebView5UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5Url = url
        )
    }
}
suspend fun setWebView6UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6Url = url
        )
    }
}
suspend fun setWebView7UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7Url = url
        )
    }
}
suspend fun setWebView8UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8Url = url
        )
    }
}
suspend fun setWebView9UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9Url = url
        )
    }
}
suspend fun setWebView10UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10Url = url
        )
    }
}
suspend fun setWebView11UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11Url = url
        )
    }
}
suspend fun setWebView12UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12Url = url
        )
    }
}
suspend fun setWebView13UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13Url = url
        )
    }
}
suspend fun setWebView14UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14Url = url
        )
    }
}
suspend fun setWebView15UrlPrefForWebAutoScroll(url: String, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15Url = url
        )
    }
}





suspend fun setWebView1TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1TotalTimer = timer
        )
    }
}
suspend fun setWebView2TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2TotalTimer = timer
        )
    }
}
suspend fun setWebView3TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3TotalTimer = timer
        )
    }
}
suspend fun setWebView4TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4TotalTimer = timer
        )
    }
}
suspend fun setWebView5TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5TotalTimer = timer
        )
    }
}
suspend fun setWebView6TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6TotalTimer = timer
        )
    }
}
suspend fun setWebView7TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7TotalTimer = timer
        )
    }
}
suspend fun setWebView8TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8TotalTimer = timer
        )
    }
}
suspend fun setWebView9TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9TotalTimer = timer
        )
    }
}
suspend fun setWebView10TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10TotalTimer = timer
        )
    }
}
suspend fun setWebView11TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11TotalTimer = timer
        )
    }
}
suspend fun setWebView12TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12TotalTimer = timer
        )
    }
}
suspend fun setWebView13TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13TotalTimer = timer
        )
    }
}
suspend fun setWebView14TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14TotalTimer = timer
        )
    }
}
suspend fun setWebView15TotalTimerPrefForWebAutoScroll(timer: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15TotalTimer = timer
        )
    }
}








suspend fun setWebView1ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1ScrollSpeed = speed
        )
    }
}
suspend fun setWebView2ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2ScrollSpeed = speed
        )
    }
}
suspend fun setWebView3ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3ScrollSpeed = speed
        )
    }
}
suspend fun setWebView4ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4ScrollSpeed = speed
        )
    }
}
suspend fun setWebView5ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5ScrollSpeed = speed
        )
    }
}
suspend fun setWebView6ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6ScrollSpeed = speed
        )
    }
}
suspend fun setWebView7ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7ScrollSpeed = speed
        )
    }
}
suspend fun setWebView8ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8ScrollSpeed = speed
        )
    }
}
suspend fun setWebView9ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9ScrollSpeed = speed
        )
    }
}
suspend fun setWebView10ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10ScrollSpeed = speed
        )
    }
}
suspend fun setWebView11ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11ScrollSpeed = speed
        )
    }
}
suspend fun setWebView12ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12ScrollSpeed = speed
        )
    }
}
suspend fun setWebView13ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13ScrollSpeed = speed
        )
    }
}
suspend fun setWebView14ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14ScrollSpeed = speed
        )
    }
}
suspend fun setWebView15ScrollSpeedPref(speed: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15ScrollSpeed = speed
        )
    }
}









suspend fun setWebView1WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web1WebLength = length
        )
    }
}
suspend fun setWebView2WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web2WebLength = length
        )
    }
}
suspend fun setWebView3WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web3WebLength = length
        )
    }
}
suspend fun setWebView4WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web4WebLength = length
        )
    }
}
suspend fun setWebView5WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web5WebLength = length
        )
    }
}
suspend fun setWebView6WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web6WebLength = length
        )
    }
}
suspend fun setWebView7WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web7WebLength = length
        )
    }
}
suspend fun setWebView8WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web8WebLength = length
        )
    }
}
suspend fun setWebView9WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web9WebLength = length
        )
    }
}
suspend fun setWebView10WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web10WebLength = length
        )
    }
}
suspend fun setWebView11WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web11WebLength = length
        )
    }
}
suspend fun setWebView12WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web12WebLength = length
        )
    }
}
suspend fun setWebView13WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web13WebLength = length
        )
    }
}
suspend fun setWebView14WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web14WebLength = length
        )
    }
}
suspend fun setWebView15WebLengthPref(length: Int, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            web15WebLength = length
        )
    }
}









suspend fun setTimerTypeForWeb1PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb1 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb2PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb2 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb3PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb3 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb4PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb4 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb5PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb5 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb6PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb6 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb7PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb7 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb8PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb8 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb9PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb9 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb10PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb10 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb11PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb11 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb12PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb12 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb13PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb13 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb14PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb14 = timerType
        )
    }
}
suspend fun setTimerTypeForWeb15PrefForWebAutoScroll(timerType: TimerType, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            timerTypeForWeb15 = timerType
        )
    }
}





suspend fun setWeb1CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox1 = boxValue
        )
    }
}
suspend fun setWeb2CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox2 = boxValue
        )
    }
}
suspend fun setWeb3CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox3 = boxValue
        )
    }
}
suspend fun setWeb4CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox4 = boxValue
        )
    }
}
suspend fun setWeb5CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox5 = boxValue
        )
    }
}
suspend fun setWeb6CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox6 = boxValue
        )
    }
}
suspend fun setWeb7CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox7 = boxValue
        )
    }
}
suspend fun setWeb8CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox8 = boxValue
        )
    }
}
suspend fun setWeb9CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox9 = boxValue
        )
    }
}
suspend fun setWeb10CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox10 = boxValue
        )
    }
}
suspend fun setWeb11CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox11 = boxValue
        )
    }
}
suspend fun setWeb12CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox12 = boxValue
        )
    }
}

suspend fun setWeb13CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox13 = boxValue
        )
    }
}

suspend fun setWeb14CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox14 = boxValue
        )
    }
}
suspend fun setWeb15CheckedForSpForWebAutoScroll(boxValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            checkBox15 = boxValue
        )
    }
}






suspend fun setPcModeForWeb1SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb1 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb2SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb2 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb3SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb3 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb4SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb4 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb5SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb5 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb6SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb6 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb7SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb7 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb8SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb8 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb9SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb9 = pcModeValue
        )
    }
}

suspend fun setPcModeForWeb10SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb10 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb11SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb11 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb12SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb12 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb13SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb13 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb14SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb14 = pcModeValue
        )
    }
}
suspend fun setPcModeForWeb15SpForWebAutoScroll(pcModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isPcModeActiveForWeb15 = pcModeValue
        )
    }
}






suspend fun setIncognitoModeForWeb1SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb1 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb2SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb2 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb3SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb3 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb4SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb4 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb5SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb5 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb6SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb6 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb7SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb7 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb8SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb8 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb9SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb9 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb10SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb10 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb11SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb11 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb12SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb12 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb13SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb13 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb14SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb14 = incognitoModeValue
        )
    }
}
suspend fun setIncognitoModeForWeb15SpForWebAutoScroll(incognitoModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isIncognitoActiveForWeb15 = incognitoModeValue
        )
    }
}






suspend fun setAdBlockerModeForWeb1SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb1 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb2SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb2 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb3SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb3 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb4SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb4 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb5SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb5 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb6SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb6 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb7SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb7 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb8SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb8 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb9SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb9 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb10SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb10 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb11SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb11 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb12SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb12 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb13SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb13 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb14SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb14 = adBlockerModeValue
        )
    }
}
suspend fun setAdBlockerModeForWeb15SpForWebAutoScroll(adBlockerModeValue: Boolean, dataStore: DataStore<WebScrollAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isAdBlockerActiveForWeb15 = adBlockerModeValue
        )
    }
}