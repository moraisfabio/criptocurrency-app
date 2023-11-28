package com.example.list_currency_crypto.presentation.coin_detail

import com.example.list_currency_crypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""

)