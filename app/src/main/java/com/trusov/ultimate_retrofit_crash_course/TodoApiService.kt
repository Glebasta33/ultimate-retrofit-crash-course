package com.trusov.ultimate_retrofit_crash_course

import retrofit2.Response
import retrofit2.http.GET

interface TodoApiService {

    @GET("todos")
    suspend fun getListOfTasks(): Response<List<Task>>
}