package com.trusov.ultimate_retrofit_crash_course

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TodoApiFactory {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: TodoApiService = retrofit.create(TodoApiService::class.java)
}