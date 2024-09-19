package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder

import android.content.Context
import android.os.CountDownTimer
import android.webkit.WebView
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.my.Zitos.MultiBroser.Tools.ScrollType
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.WebControllerType
import java.util.Locale
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds


class WebViewHolderForAutoScroll (context: Context){


    val webView by mutableStateOf<WebView>(WebView(context))


    var webController by mutableStateOf(WebControllerType.DO_NOTING)

    var webViewUrl by mutableStateOf<String?>(null)
    var timerType by mutableStateOf<TimerType?>(null)
    var  totalTime by mutableStateOf<Int?>(null)
    var scrollSpeed by mutableStateOf<Int?>(null)
    var webPageTotalHeight by mutableStateOf<Int?>(null)
    var heightScrolled by mutableIntStateOf(0)
    var webProgressValue by mutableIntStateOf(0)

    var isPcModeActive by mutableStateOf<Boolean?>(null)
    var isAdBlockerActive by mutableStateOf<Boolean?>(null)
    var isIncognitoActive by mutableStateOf<Boolean?>(null)

    var scrollType by  mutableStateOf(ScrollType.Down)


    val timerClass  = TimerClass()




    inner class TimerClass {

        private var mCountDownTimer: CountDownTimer? = null



        private var totalTimeInMilliSeconds: Long by mutableLongStateOf(600000)


        private var mTimeLeftInMillis = totalTimeInMilliSeconds




        var isTimerRunning  by mutableStateOf(false)
        var isTimerRunningBeforeActivityIsPaused  by mutableStateOf(false)
        fun userPausedTheTimerBeforeTheActivityIsPaused(){
            isTimerRunningBeforeActivityIsPaused = false
        }


        private val _timeCountDownLeft = mutableStateOf("00:00:00")
        val timeCountDownLeft: State<String> = _timeCountDownLeft





        private var isPlayButtonClickedByTheUser = false

        fun changeIsPlayButtonClicked(newValue: Boolean){
            isPlayButtonClickedByTheUser = newValue
        }


        fun reStartTimer(){

            if (isTimerRunning){
                pauseTimer()
            }

            resetTimer()

            if (isPlayButtonClickedByTheUser){

                startTimer()

            }

        }

        private var isActivityCreatedBefore = false


        fun initializingTime(timerType: TimerType, spTimeValue: Int){

            if (!isActivityCreatedBefore) {

                if (isTimerRunning) {
                    pauseTimer()
                }

                totalTimeInMilliSeconds = if (timerType == TimerType.MINUTES) {
                    spTimeValue.minutes.inWholeMilliseconds

                } else {
                    spTimeValue.seconds.inWholeMilliseconds
                }
                resetTimer()
                isActivityCreatedBefore = true
            }


        }

        fun changeTimerDurationInMinutes(newTimeInMinutes : Int){

            if (isTimerRunning){
                pauseTimer()
            }
            totalTimeInMilliSeconds = newTimeInMinutes.minutes.inWholeMilliseconds
            resetTimer()
        }


        fun changeTimerDurationInSeconds(newTimeInSeconds : Int){

            if (isTimerRunning){
                pauseTimer()
            }
            totalTimeInMilliSeconds = newTimeInSeconds.seconds.inWholeMilliseconds
            resetTimer()

        }






        fun startTimer() {
            mCountDownTimer = object : CountDownTimer(mTimeLeftInMillis, 1000) {
                override fun onTick(millisUntilFinished: Long) {

                    heightScrolled++

                    if (heightScrolled >= webPageTotalHeight!!){
                        heightScrolled = 0

                        if (scrollType == ScrollType.UP){
                            scrollType = ScrollType.Down
                        }else {
                            scrollType = ScrollType.UP
                        }

                    }


                    if (scrollType == ScrollType.Down){
                        webView.scrollBy(0,scrollSpeed!!)
                    }
                    if (scrollType == ScrollType.UP){
                        webView.scrollBy(0,-scrollSpeed!!)
                    }


                    mTimeLeftInMillis = millisUntilFinished
                    updateCountDownText()
                }

                override fun onFinish() {

                    isTimerRunning = false
                    isTimerRunningBeforeActivityIsPaused = false
                    resetTimer()
                    webController = WebControllerType.CLEAR_DATA_AND_RELOAD



                }
            }.start()
            isTimerRunning = true
            isTimerRunningBeforeActivityIsPaused = true

        }

        fun pauseTimer() {
            mCountDownTimer!!.cancel()
            isTimerRunning = false

        }

        fun resetTimer() {
            mTimeLeftInMillis = totalTimeInMilliSeconds
            updateCountDownText()
        }

        private fun updateCountDownText() {
            val hours = (mTimeLeftInMillis / (1000 * 60 * 60)).toInt()
            val minutes = ((mTimeLeftInMillis / (1000 * 60)) % 60).toInt()
            val seconds = ((mTimeLeftInMillis / 1000) % 60).toInt()
            val timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds)

            _timeCountDownLeft.value = timeLeftFormatted
        }




    }













}
