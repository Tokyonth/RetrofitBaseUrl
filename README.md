# RetrofitBaseUrl
RetrofitBaseUrl动态切换

1. 在你需要替换baseUrl的请求方法上加上ReplaceBaseUrl注解
```kotlin
@ReplaceBaseUrl(Constants.GOOGLE)
@POST("search")
fun google()
```

2. 只需要把原本创建Retrofit的create(xxx.class)替换为attachBaseUrl(xxx.class)
```kotlin
Retrofit.Builder()
        .baseUrl(Constants.BAIDU)
        .client(okHttpClient)
        .build()
        .attachBaseUrl(ApiInterface::class.java)
```

细节可查看示例代码