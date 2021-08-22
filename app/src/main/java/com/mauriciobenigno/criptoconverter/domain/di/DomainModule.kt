package com.mauriciobenigno.criptoconverter.domain.di

import com.mauriciobenigno.criptoconverter.domain.GetExchangeValueUseCase
import com.mauriciobenigno.criptoconverter.domain.ListExchangeUseCase
import com.mauriciobenigno.criptoconverter.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}