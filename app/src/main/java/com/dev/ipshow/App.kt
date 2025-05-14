package com.dev.ipshow

import android.app.Application
import com.dev.ipshow.data.di.provideApiService
import com.dev.ipshow.data.di.provideRetrofit
import com.dev.ipshow.data.repository.AddressIpRepositoryImpl
import com.dev.ipshow.domaine.repository.AddressIpRepository
import com.dev.ipshow.domaine.usescase.GetAddressIpUseCase
import com.dev.ipshow.ui.screens.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}
val appModule = module {
    single { provideRetrofit() }
    single { provideApiService(get()) }

    single { MainViewModel(get()) }
    factory { GetAddressIpUseCase(get()) }

    single { AddressIpRepositoryImpl(get()) as AddressIpRepository }
}
