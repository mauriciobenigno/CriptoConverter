package com.mauriciobenigno.criptoconverter.domain

import com.mauriciobenigno.criptoconverter.core.UseCase
import com.mauriciobenigno.criptoconverter.data.model.ExchangeResponseValue
import com.mauriciobenigno.criptoconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}