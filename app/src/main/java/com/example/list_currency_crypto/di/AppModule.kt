package com.example.list_currency_crypto.di

import com.example.list_currency_crypto.common.Constants
import com.example.list_currency_crypto.data.remote.dto.CoinPaprikaApi
import com.example.list_currency_crypto.data.repository.CoinRepositoryImpl
import com.example.list_currency_crypto.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesParikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi) : CoinRepository {
        return CoinRepositoryImpl(api)
    }
}