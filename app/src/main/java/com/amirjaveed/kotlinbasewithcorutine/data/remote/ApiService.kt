package com.amirjaveed.kotlinbasewithcorutine.data.remote


import com.amirjaveed.kotlinbasewithcorutine.data.models.PostsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<PostsResponse>
}