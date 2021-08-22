package com.mauriciobenigno.criptoconverter.domain

import com.mauriciobenigno.criptoconverter.core.UseCase
import com.mauriciobenigno.criptoconverter.data.model.ExchangeResponseValue
import com.mauriciobenigno.criptoconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}