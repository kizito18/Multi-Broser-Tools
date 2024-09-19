package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.sharedPref

import androidx.datastore.core.Serializer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream


object WebAutoRefreshSerializer : Serializer<WebRefreshAllPref> {
    override val defaultValue: WebRefreshAllPref
        get() = WebRefreshAllPref()

    override suspend fun readFrom(input: InputStream): WebRefreshAllPref {

        return try {

            Json.decodeFromString(
                deserializer = WebRefreshAllPref.serializer(),
                string = input.readBytes().decodeToString()

            )

        }catch (e: SerializationException){

            e.printStackTrace()
            defaultValue

        }


    }

    override suspend fun writeTo(t: WebRefreshAllPref, output: OutputStream) {

        withContext(Dispatchers.IO) {

            output.write(

                Json.encodeToString(

                    serializer = WebRefreshAllPref.serializer(),
                    value = t
                ).encodeToByteArray()

            )
        }


    }


}
