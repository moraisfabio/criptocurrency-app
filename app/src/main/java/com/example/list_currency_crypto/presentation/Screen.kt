package com.example.list_currency_crypto.presentation

sealed class Screen(val route: String){
    object CoinListItem: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}