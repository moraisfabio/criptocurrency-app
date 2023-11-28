package com.example.list_currency_crypto.presentation.coin_list

import com.example.list_currency_crypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""

)
