package com.example.list_currency_crypto.domain.repository

import com.example.list_currency_crypto.data.remote.dto.CoinDTO
import com.example.list_currency_crypto.data.remote.dto.CoinDetailDTO

interface CoinRepository {
    suspend fun getCoins() : List<CoinDTO>
    suspend fun getCoinById(coinId: String): CoinDetailDTO
}