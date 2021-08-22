package com.mauriciobenigno.criptoconverter.domain

import com.mauriciobenigno.criptoconverter.core.UseCase
import com.mauriciobenigno.criptoconverter.data.model.ExchangeResponseValue
import com.mauriciobenigno.criptoconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}