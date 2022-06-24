package com.tokyonth.retrofitbaseurl

import com.tokyonth.retrofitbaseurl.url.ReplaceBaseUrl
import retrofit2.http.POST

interface ApiInterface {

    @POST("search")
    fun baidu()

    @ReplaceBaseUrl(Constants.GOOGLE)
    @POST("search")
    fun google()

}
