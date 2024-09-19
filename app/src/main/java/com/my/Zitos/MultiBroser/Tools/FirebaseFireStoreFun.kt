package com.my.Zitos.MultiBroser.Tools

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.tasks.await


suspend fun getDataFromFireStore(): Pair<String, Boolean> {
    val db = FirebaseFirestore.getInstance()

    try {
        val querySnapshot = db.collection("app_Update").get().await()
        if (!querySnapshot.isEmpty) {
            // Access the document snapshot
            val documentSnapshot = querySnapshot.documents.first()

            // Check if the field "appUrl" exists and retrieve its value
            val appUrl = if (documentSnapshot.contains("appUrl")) {
                documentSnapshot.getString("appUrl") ?: ""
            } else {
                // Handle case where the field doesn't exist
                Log.e("FireStore", "Field 'appUrl' doesn't exist")
                ObjectsIds.DEFAULT_DOWNLOAD_LINK
            }

            // Check if the field "your_field_name" exists and retrieve its value
            val update = if (documentSnapshot.contains("update3")) {
                documentSnapshot.getBoolean("update3") ?: false
            } else {
                // Handle case where the field doesn't exist
                Log.e("FireStore", "Field 'update3' doesn't exist")
                false
            }

            return Pair(appUrl, update)
        }
    } catch (e: FirebaseFirestoreException) {
        // Handle FireStore exception
        Log.e("FireStore", "Error fetching data from FireStore: $e")
    }

    // Return default values if data retrieval fails
    return Pair("", false)
}

