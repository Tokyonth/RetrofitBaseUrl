package com.tokyonth.retrofitbaseurl

import com.tokyonth.retrofitbaseurl.url.attachBaseUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class ApiRepository {

    companion object {

        val api by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            ApiRepository().getApiGenerator()
        }

    }

    private fun getApiGenerator(): ApiInterface {
        return Retrofit.Builder()
            .baseUrl(Constants.BAIDU)
            .client(okHttpClient)
            .build()
            .attachBaseUrl(ApiInterface::class.java)
    }

    private val okHttpClient: OkHttpClient
        get() {
            return OkHttpClient.Builder().apply {
                connectTimeout(8, TimeUnit.SECONDS)
                readTimeout(5, TimeUnit.SECONDS)
                writeTimeout(5, TimeUnit.SECONDS)
            }.build()
        }

}
