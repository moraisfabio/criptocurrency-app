package com.example.list_currency_crypto.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("coin_counter")
    val coinCounter: Int,
    @SerializedName("iso_counter")
    val icoCounter: Int,
    val id: String,
    val name: String
)