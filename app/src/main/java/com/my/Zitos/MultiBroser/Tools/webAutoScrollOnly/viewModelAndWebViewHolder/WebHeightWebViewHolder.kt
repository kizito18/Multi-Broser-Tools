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
import com.my.Zitos.MultiBroser.Tools.WebControllerType
import java.util.Locale


class WebHeightWebViewHolder (context: Context){


    val webView by mutableStateOf<WebView>(WebView(context))


    var webController by mutableStateOf(WebControllerType.LOAD_URL)

    var webViewUrl by mutableStateOf<String?>(null)
    var scrollSpeed by mutableStateOf<Int?>(null)
    var webHeight by mutableIntStateOf(0)
    var webProgressValue by mutableIntStateOf(0)
    var isWebPageLoading by mutableStateOf(true)




    val timerClass  = TimerClass()




    /*
    inner class TimerClass {

        private var mCountDownTimer: CountDownTimer? = null



       // private var totalTimeInMilliSeconds: Long by mutableLongStateOf(600000)
        private var totalTimeInMilliSeconds: Long by mutableLongStateOf(
            totalTime.minutes.inWholeMilliseconds
        )


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


        fun initializingTime(){

            if (!isActivityCreatedBefore) {

                if (isTimerRunning) {
                    pauseTimer()
                }

                resetTimer()
                isActivityCreatedBefore = true
            }


        }






        fun startTimer() {
            mCountDownTimer = object : CountDownTimer(mTimeLeftInMillis, 1000) {
                override fun onTick(millisUntilFinished: Long) {
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

    */


    inner class TimerClass {

        private var mCountUpTimer: CountDownTimer? = null

        // Start at 0 milliseconds
        private var mTimeElapsedInMillis: Long by mutableLongStateOf(0)

        var isTimerRunning by mutableStateOf(false)

        var isTimerRunningBeforeActivityIsPaused by mutableStateOf(false)
        fun userPausedTheTimerBeforeTheActivityIsPaused(){
            isTimerRunningBeforeActivityIsPaused = false
        }

        private val _timeCountUp = mutableStateOf("00:00:00")
        val timeCountUpValue: State<String> = _timeCountUp

        private var isPlayButtonClickedByTheUser = false



        fun changeIsPlayButtonClicked(newValue: Boolean){
            isPlayButtonClickedByTheUser = newValue
        }


        fun reStartTimer() {

            if (isTimerRunning) {
                pauseTimer()
            }

            resetTimer()

            if (isPlayButtonClickedByTheUser) {
                startTimer()
            }
        }




        private var isActivityCreatedBefore = false

        fun initializingTime(){

            if (!isActivityCreatedBefore) {

                if (isTimerRunning) {
                    pauseTimer()
                }

                resetTimer()
                isActivityCreatedBefore = true
            }


        }

        fun startTimer() {
            mCountUpTimer = object : CountDownTimer(Long.MAX_VALUE, 1000) {
                override fun onTick(millisUntilFinished: Long) {

                    if (!isWebPageLoading){

                        webView.scrollBy(0,scrollSpeed!!)
                        webHeight++

                    }


                    mTimeElapsedInMillis += 1000  // Increment by 1 second
                    updateCountUpText()
                }

                override fun onFinish() {
                    // No action needed since this is a count-up timer
                }
            }.start()
            isTimerRunning = true
            isTimerRunningBeforeActivityIsPaused = true
        }

        fun pauseTimer() {
            mCountUpTimer?.cancel()
            isTimerRunning = false
        }

        fun resetTimer() {
            mTimeElapsedInMillis = 0  // Reset to 0 milliseconds
            updateCountUpText()
        }

        private fun updateCountUpText() {
            val hours = (mTimeElapsedInMillis / (1000 * 60 * 60)).toInt()
            val minutes = ((mTimeElapsedInMillis / (1000 * 60)) % 60).toInt()
            val seconds = ((mTimeElapsedInMillis / 1000) % 60).toInt()
            val timeUpFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds)
            _timeCountUp.value = timeUpFormatted
        }
    }




}
