package com.example.apis

import retrofit2.Call
import retrofit2.http.GET

interface Api_Interface {

    @GET("products")
    fun getProductData() : Call<MyData>
}