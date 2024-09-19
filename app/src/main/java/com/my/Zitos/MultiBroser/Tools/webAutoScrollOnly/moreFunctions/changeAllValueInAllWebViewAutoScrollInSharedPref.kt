package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import android.content.Context
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.dataStoreForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb10SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb11SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb12SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb13SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb14SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb15SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb1SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb2SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb3SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb4SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb5SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb6SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb7SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb8SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setAdBlockerModeForWeb9SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb10SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb11SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb12SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb13SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb14SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb15SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb1SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb2SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb3SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb4SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb5SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb6SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb7SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb8SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setIncognitoModeForWeb9SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb10SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb11SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb12SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb13SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb14SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb15SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb1SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb2SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb3SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb4SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb5SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb6SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb7SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb8SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setPcModeForWeb9SpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb10PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb11PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb12PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb13PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb14PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb15PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb1PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb2PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb3PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb4PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb5PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb6PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb7PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb8PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setTimerTypeForWeb9PrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView10WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView11WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView12WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView13WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView14WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView15WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView1WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView2WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView3WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView4WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView5WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView6WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView7WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView8WebLengthPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9ScrollSpeedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9TotalTimerPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9UrlPrefForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWebView9WebLengthPref


suspend fun changeAllValueInAllWebViewAutoScrollInSharedPref(
    context: Context,
    timerType: TimerType,
    url: String,
    timeSelected:Int,
    speedSelected: Int,
    webLengthSelected: Int,
    pcMode: Boolean,
    incognitoMode: Boolean,
    adBlockerMode:Boolean
) {

    setWebView1UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb1PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView1TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView1ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView1WebLengthPref(
          length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb1SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb1SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb1SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)





    setWebView2UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb2PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView2TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView2ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView2WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb2SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb2SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb2SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView3UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb3PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView3TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView3ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView3WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb3SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb3SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb3SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView4UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb4PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView4TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView4ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView4WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb4SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb4SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb4SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)





    setWebView5UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb5PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView5TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView5ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView5WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb5SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb5SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb5SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)





    setWebView6UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb6PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView6TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView6ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView6WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb6SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb6SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb6SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView7UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb7PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView7TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView7ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView7WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb7SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb7SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb7SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView8UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb8PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView8TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView8ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView8WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb8SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb8SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb8SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView9UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb9PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView9TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView9ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView9WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb9SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb9SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb9SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)





    setWebView10UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb10PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView10TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView10ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView10WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb10SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb10SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb10SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView11UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb11PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView11TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView11ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView11WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb11SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb11SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb11SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView12UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb12PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView12TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView12ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView12WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb12SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb12SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb12SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)




    setWebView13UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb13PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView13TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView13ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView13WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb13SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb13SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb13SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)





    setWebView14UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb14PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView14TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView14ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView14WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb14SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb14SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb14SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)





    setWebView15UrlPrefForWebAutoScroll(
        url = url,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setTimerTypeForWeb15PrefForWebAutoScroll(
        timerType = timerType,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView15TotalTimerPrefForWebAutoScroll(
        timer = timeSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView15ScrollSpeedPref(
        speed = speedSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setWebView15WebLengthPref(
        length = webLengthSelected,
        dataStore = context.dataStoreForWebAutoScroll
    )
    setPcModeForWeb15SpForWebAutoScroll(pcModeValue = pcMode, dataStore = context.dataStoreForWebAutoScroll)
    setIncognitoModeForWeb15SpForWebAutoScroll(incognitoModeValue = incognitoMode, dataStore = context.dataStoreForWebAutoScroll)
    setAdBlockerModeForWeb15SpForWebAutoScroll(adBlockerModeValue = adBlockerMode, dataStore = context.dataStoreForWebAutoScroll)



}

