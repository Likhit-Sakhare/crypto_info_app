package com.likhit.cryptocurrencyapp.data.remote

import com.likhit.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.likhit.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    //Here we will have two functions one is to get all the coins and other is to get the details about a specific coin with the coinId
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(
        @Path("coinId") coinId: String
    ): CoinDetailDto
}