package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref

import androidx.datastore.core.Serializer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream

object WebAutoScrollSerializer: Serializer<WebScrollAllPref> {
    override val defaultValue: WebScrollAllPref
        get() = WebScrollAllPref()

    override suspend fun readFrom(input: InputStream): WebScrollAllPref {

        return try {

            Json.decodeFromString(
                deserializer = WebScrollAllPref.serializer(),
                string = input.readBytes().decodeToString()

            )

        }catch (e: SerializationException){

            e.printStackTrace()
            defaultValue

        }


    }

    override suspend fun writeTo(t: WebScrollAllPref, output: OutputStream) {

        withContext(Dispatchers.IO) {

            output.write(

                Json.encodeToString(

                    serializer = WebScrollAllPref.serializer(),
                    value = t
                ).encodeToByteArray()

            )
        }


    }


}
