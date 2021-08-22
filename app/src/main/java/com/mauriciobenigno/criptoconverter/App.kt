package com.mauriciobenigno.criptoconverter

import android.app.Application
import android.app.Presentation
import com.mauriciobenigno.criptoconverter.data.di.DataModules
import com.mauriciobenigno.criptoconverter.domain.di.DomainModule
import com.mauriciobenigno.criptoconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}