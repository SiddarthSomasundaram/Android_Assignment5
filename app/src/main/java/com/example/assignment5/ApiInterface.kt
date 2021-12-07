package com.example.assignment5

import retrofit2.http.GET

interface ApiInterface {
    @GET("books")
    suspend fun getBooks():List<Books>

}