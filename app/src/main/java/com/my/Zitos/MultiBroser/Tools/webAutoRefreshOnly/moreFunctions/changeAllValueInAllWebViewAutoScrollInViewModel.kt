package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions

import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.WebControllerType
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.viewModelAndWebViewHolder.BrowserAutoRefreshViewModel

fun changeAllValueInAllWebViewAutoRefreshInViewModel (
    browserAutoRefreshViewModel: BrowserAutoRefreshViewModel,
    timerType: TimerType,
    url: String,
    timeSelected:Int,
    pcMode: Boolean,
    incognitoMode: Boolean,
    adBlockerMode: Boolean
){

    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder1.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder1.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder1.value.webViewUrl = url
    browserAutoRefreshViewModel.webViewHolder1.value.timerType = timerType
    browserAutoRefreshViewModel.webViewHolder1.value.totalTime = timeSelected
    browserAutoRefreshViewModel.webViewHolder1.value.webController = WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder1.value.isPcModeActive = pcMode
    browserAutoRefreshViewModel.webViewHolder1.value.isIncognitoActive = incognitoMode
    browserAutoRefreshViewModel.webViewHolder1.value.isAdBlockerActive = adBlockerMode





    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder2.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder2.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder2.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder2.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder2.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder2.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder2.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder2.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder2.value.isAdBlockerActive= adBlockerMode




    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder3.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder3.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder3.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder3.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder3.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder3.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder3.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder3.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder3.value.isAdBlockerActive= adBlockerMode




    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder4.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder4.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder4.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder4.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder4.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder4.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder4.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder4.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder4.value.isAdBlockerActive= adBlockerMode




    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder5.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder5.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder5.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder5.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder5.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder5.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder5.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder5.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder5.value.isAdBlockerActive= adBlockerMode




    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder6.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder6.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder6.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder6.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder6.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder6.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder6.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder6.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder6.value.isAdBlockerActive= adBlockerMode




    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder7.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder7.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder7.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder7.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder7.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder7.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder7.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder7.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder7.value.isAdBlockerActive= adBlockerMode





    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder8.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder8.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder8.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder8.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder8.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder8.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder8.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder8.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder8.value.isAdBlockerActive= adBlockerMode





    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder9.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder9.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder9.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder9.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder9.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder9.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder9.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder9.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder9.value.isAdBlockerActive= adBlockerMode





    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder10.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder10.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder10.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder10.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder10.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder10.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder10.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder10.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder10.value.isAdBlockerActive= adBlockerMode






    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder11.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder11.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder11.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder11.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder11.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder11.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder11.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder11.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder11.value.isAdBlockerActive= adBlockerMode






    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder12.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder12.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder12.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder12.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder12.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder12.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder12.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder12.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder12.value.isAdBlockerActive= adBlockerMode






    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder13.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder13.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder13.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder13.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder13.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder13.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder13.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder13.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder13.value.isAdBlockerActive= adBlockerMode






    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder14.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder14.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder14.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder14.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder14.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder14.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder14.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder14.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder14.value.isAdBlockerActive= adBlockerMode






    if (timerType == TimerType.MINUTES) {
        browserAutoRefreshViewModel.webViewHolder15.value.timerClass.changeTimerDurationInMinutes(
            timeSelected
        )
    } else {
        browserAutoRefreshViewModel.webViewHolder15.value.timerClass.changeTimerDurationInSeconds(
            timeSelected
        )
    }
    browserAutoRefreshViewModel.webViewHolder15.value.webViewUrl= url
    browserAutoRefreshViewModel.webViewHolder15.value.timerType= timerType
    browserAutoRefreshViewModel.webViewHolder15.value.totalTime= timeSelected
    browserAutoRefreshViewModel.webViewHolder15.value.webController= WebControllerType.LOAD_URL

    browserAutoRefreshViewModel.webViewHolder15.value.isPcModeActive= pcMode
    browserAutoRefreshViewModel.webViewHolder15.value.isIncognitoActive= incognitoMode
    browserAutoRefreshViewModel.webViewHolder15.value.isAdBlockerActive= adBlockerMode






}