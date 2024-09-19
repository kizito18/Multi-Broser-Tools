package com.my.Zitos.MultiBroser.Tools

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember


@Composable
fun BackHandler(
    onBackPressed: () -> Unit
) {


    val onBackPressedDispatcherOwner = LocalOnBackPressedDispatcherOwner.current

    val backCallback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Handle back press
                onBackPressed()
            }
        }
    }

    DisposableEffect(onBackPressedDispatcherOwner) {
        backCallback.isEnabled = true
        onBackPressedDispatcherOwner!!.onBackPressedDispatcher.addCallback(backCallback)

        onDispose {
            backCallback.remove()
        }
    }
}

