package id.co.tetanggakita

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

class IntTypeAdapter : TypeAdapter<Int>() {
    override fun write(out: JsonWriter, value: Int) {
        out.value(value)
    }

    override fun read(`in`: JsonReader): Int {
        val value = `in`.nextString()
        return try {
            value.toInt()
        } catch (e: NumberFormatException) {
            0
        }
    }
}