package com.likhit.cryptocurrencyapp.domain.use_case.getCoin

import com.likhit.cryptocurrencyapp.common.Resource
import com.likhit.cryptocurrencyapp.data.remote.dto.toCoin
import com.likhit.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.likhit.cryptocurrencyapp.domain.model.Coin
import com.likhit.cryptocurrencyapp.domain.model.CoinDetail
import com.likhit.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>>{
        return flow {
            try {
                emit(Resource.Loading())
                val coin = repository.getCoinById(coinId).toCoinDetail()
                emit(Resource.Success(coin))
            }catch (e: HttpException){
                emit(Resource.Error(message = e.localizedMessage?: "An unexpected error occurred"))
            }catch (e: IOException){
                emit(Resource.Error(message = "Couldn't reach server. Check your Internet connection"))
            }
        }
    }
}