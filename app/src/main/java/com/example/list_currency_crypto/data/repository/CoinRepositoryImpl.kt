package com.example.list_currency_crypto.data.repository

import com.example.list_currency_crypto.data.remote.dto.CoinPaprikaApi
import com.example.list_currency_crypto.domain.repository.CoinRepository
import com.example.list_currency_crypto.data.remote.dto.CoinDTO
import com.example.list_currency_crypto.data.remote.dto.CoinDetailDTO
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDTO {
        return api.getCoinById(coinId)
    }
}