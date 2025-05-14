package com.dev.ipshow.data.di

import com.dev.ipshow.data.service.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://api.ipify.org/?format=json")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun provideApiService(retrofit: Retrofit): ApiService {
    return retrofit.create(ApiService::class.java)
}


