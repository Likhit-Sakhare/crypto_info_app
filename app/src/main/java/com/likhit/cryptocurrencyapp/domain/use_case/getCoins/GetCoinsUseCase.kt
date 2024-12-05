package com.likhit.cryptocurrencyapp.domain.use_case.getCoins

import com.likhit.cryptocurrencyapp.common.Resource
import com.likhit.cryptocurrencyapp.data.remote.dto.toCoin
import com.likhit.cryptocurrencyapp.domain.model.Coin
import com.likhit.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>>{
        return flow {
            try {
                emit(Resource.Loading())
                val coins = repository.getCoins().map { it.toCoin() }
                emit(Resource.Success(coins))
            }catch (e: HttpException){
                emit(Resource.Error(message = e.localizedMessage?: "An unexpected error occurred"))
            }catch (e: IOException){
                emit(Resource.Error(message = "Couldn't reach server. Check your Internet connection"))
            }
        }
    }
}