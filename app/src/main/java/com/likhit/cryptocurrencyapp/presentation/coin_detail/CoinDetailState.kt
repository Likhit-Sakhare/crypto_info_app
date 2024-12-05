package com.likhit.cryptocurrencyapp.presentation.coin_detail

import com.likhit.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
