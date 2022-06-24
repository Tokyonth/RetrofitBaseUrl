package com.tokyonth.retrofitbaseurl.url

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class ReplaceBaseUrl(
    val url: String
)
