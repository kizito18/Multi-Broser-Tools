package com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate

import androidx.datastore.core.Serializer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream


object AppUpdateSerializer : Serializer<AppUpdateAllPref> {
    override val defaultValue: AppUpdateAllPref
        get() = AppUpdateAllPref()

    override suspend fun readFrom(input: InputStream): AppUpdateAllPref {

        return try {

            Json.decodeFromString(
                deserializer = AppUpdateAllPref.serializer(),
                string = input.readBytes().decodeToString()

            )

        }catch (e: SerializationException){

            e.printStackTrace()
            defaultValue

        }


    }

    override suspend fun writeTo(t: AppUpdateAllPref, output: OutputStream) {

        withContext(Dispatchers.IO) {

            output.write(

                Json.encodeToString(

                    serializer = AppUpdateAllPref.serializer(),
                    value = t
                ).encodeToByteArray()

            )
        }


    }


}
