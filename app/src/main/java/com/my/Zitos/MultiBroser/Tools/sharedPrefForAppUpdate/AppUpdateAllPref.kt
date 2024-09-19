package com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate

import androidx.datastore.core.DataStore
import com.my.Zitos.MultiBroser.Tools.ObjectsIds
import kotlinx.serialization.Serializable


@Serializable
data class AppUpdateAllPref (

    val appDownloadUrl : String = ObjectsIds.DEFAULT_DOWNLOAD_LINK,
    val isUpdateAvailable : Boolean = false,
)



suspend fun setAppDownloadUrlPref(downloadUrl: String, dataStore: DataStore<AppUpdateAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            appDownloadUrl = downloadUrl
        )
    }
}


suspend fun setIsUpdateAvailablePref(isUpdateAvailable: Boolean, dataStore: DataStore<AppUpdateAllPref>) {
    dataStore.updateData { currentData ->
        currentData.copy(
            isUpdateAvailable = isUpdateAvailable
        )
    }
}
