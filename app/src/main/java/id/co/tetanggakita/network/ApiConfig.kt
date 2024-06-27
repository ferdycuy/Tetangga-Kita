package id.co.tetanggakita.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import id.co.tetanggakita.IntTypeAdapter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    private const val BASE_URL = "https://api.apispreadsheets.com/data/RnfWsAzVuGpAFnfT/"

    fun getApiService(): ApiService {
        val gson: Gson = GsonBuilder()
            .registerTypeAdapter(Int::class.java, IntTypeAdapter())
            .create()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return retrofit.create(ApiService::class.java)
    }
}
