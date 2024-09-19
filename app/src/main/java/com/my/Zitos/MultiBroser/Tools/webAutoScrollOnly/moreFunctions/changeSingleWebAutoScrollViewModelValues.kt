package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions

import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.WebControllerType
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModel

fun changeSingleWebAutoScrollViewModelValues(
    webNum: Int,
    browserAutoScrollViewModel: BrowserAutoScrollViewModel,
    timerType: TimerType,
    url: String,
    timeSelected:Int,
    speedSelected:Int,
    webLengthSelected: Int,
    pcMode: Boolean,
    incognitoMode: Boolean,
    adBlockerMode: Boolean
) {


    if (webNum ==1) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder1.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder1.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder1.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder1.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder1.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder1.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder1.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder1.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder1.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder1.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder1.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 2) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder2.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder2.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder2.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder2.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder2.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder2.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder2.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder2.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder2.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder2.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder2.value.webController= WebControllerType.LOAD_URL


    }


    if (webNum == 3) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder3.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder3.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder3.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder3.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder3.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder3.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder3.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder3.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder3.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder3.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder3.value.webController= WebControllerType.LOAD_URL


    }


    if (webNum == 4) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder4.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder4.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder4.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder4.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder4.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder4.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder4.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder4.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder4.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder4.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder4.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 5) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder5.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder5.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder5.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder5.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder5.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder5.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder5.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder5.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder5.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder5.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder5.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 6) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder6.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder6.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder6.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder6.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder6.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder6.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder6.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder6.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder6.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder6.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder6.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 7) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder7.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder7.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder7.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder7.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder7.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder7.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder7.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder7.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder7.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder7.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder7.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 8) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder8.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder8.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder8.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder8.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder8.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder8.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder8.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder8.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder8.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder8.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder8.value.webController= WebControllerType.LOAD_URL

    }



    if (webNum == 9) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder9.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder9.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder9.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder9.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder9.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder9.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder9.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder9.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder9.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder9.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder9.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 10) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder10.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder10.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder10.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder10.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder10.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder10.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder10.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder10.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder10.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder10.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder10.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 11) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder11.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder11.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder11.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder11.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder11.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder11.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder11.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder11.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder11.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder11.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder11.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 12) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder12.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder12.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder12.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder12.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder12.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder12.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder12.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder12.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder12.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder12.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder12.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 13) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder13.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder13.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder13.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder13.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder13.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder13.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder13.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder13.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder13.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder13.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder13.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 14) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder14.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder14.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder14.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder14.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder14.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder14.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder14.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder14.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder14.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder14.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder14.value.webController= WebControllerType.LOAD_URL


    }



    if (webNum == 15) {

        if (timerType == TimerType.MINUTES) {
            browserAutoScrollViewModel.webViewHolder15.value.timerClass.changeTimerDurationInMinutes(
                timeSelected
            )
        } else {
            browserAutoScrollViewModel.webViewHolder15.value.timerClass.changeTimerDurationInSeconds(
                timeSelected
            )
        }
        browserAutoScrollViewModel.webViewHolder15.value.webViewUrl= url
        browserAutoScrollViewModel.webViewHolder15.value.timerType= timerType
        browserAutoScrollViewModel.webViewHolder15.value.totalTime= timeSelected
        browserAutoScrollViewModel.webViewHolder15.value.scrollSpeed= speedSelected
        browserAutoScrollViewModel.webViewHolder15.value.webPageTotalHeight= webLengthSelected

        browserAutoScrollViewModel.webViewHolder15.value.isPcModeActive= pcMode
        browserAutoScrollViewModel.webViewHolder15.value.isIncognitoActive= incognitoMode
        browserAutoScrollViewModel.webViewHolder15.value.isAdBlockerActive= adBlockerMode
        browserAutoScrollViewModel.webViewHolder15.value.webController= WebControllerType.LOAD_URL


    }



}