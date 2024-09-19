package com.my.Zitos.MultiBroser.Tools.webNormalOnly.sharedPref

import androidx.datastore.core.Serializer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream


object WebNormalSerializer : Serializer<WebNormalAllPref> {
    override val defaultValue: WebNormalAllPref
        get() = WebNormalAllPref()

    override suspend fun readFrom(input: InputStream): WebNormalAllPref {

        return try {

            Json.decodeFromString(
                deserializer = WebNormalAllPref.serializer(),
                string = input.readBytes().decodeToString()

            )

        }catch (e: SerializationException){

            e.printStackTrace()
            defaultValue

        }


    }

    override suspend fun writeTo(t: WebNormalAllPref, output: OutputStream) {

        withContext(Dispatchers.IO) {

            output.write(

                Json.encodeToString(

                    serializer = WebNormalAllPref.serializer(),
                    value = t
                ).encodeToByteArray()

            )
        }


    }


}
