package com.dev.ipshow.data.service

import com.dev.ipshow.data.model.IpDto
import retrofit2.http.GET

interface ApiService {
    @GET("?format=json")
    suspend fun getAddressIp(): IpDto

}