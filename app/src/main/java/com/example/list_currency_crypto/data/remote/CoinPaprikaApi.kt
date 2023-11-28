package com.example.list_currency_crypto.data.remote

import com.example.list_currency_crypto.data.remote.dto.CoinDTO
import com.example.list_currency_crypto.data.remote.dto.CoinDetailDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String) : CoinDetailDTO
}