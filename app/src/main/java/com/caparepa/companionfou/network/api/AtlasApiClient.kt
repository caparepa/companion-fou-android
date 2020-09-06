package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.BuildConfig
import com.caparepa.companionfou.utils.ATLAS_ACADEMY_BASE_URL
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AtlasApiClient {

    companion object {
        operator fun invoke(
        ): AtlasAcademyEndpoints {

            //TODO: add interceptors as required!
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.BASE_URL)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AtlasAcademyEndpoints::class.java)
        }
    }

}