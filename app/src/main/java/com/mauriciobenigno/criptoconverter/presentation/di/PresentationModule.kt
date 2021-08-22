package com.mauriciobenigno.criptoconverter.presentation.di

import com.mauriciobenigno.criptoconverter.presentation.HistoryViewModel
import com.mauriciobenigno.criptoconverter.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load() {
        loadKoinModules(viewModelModules())
    }

    private fun viewModelModules(): Module {
        return module {
            viewModel { HistoryViewModel(get()) }
            viewModel { MainViewModel(get(), get()) }
        }
    }
}