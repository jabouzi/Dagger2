package com.skanderjabouzi.dagger.modules

import com.skanderjabouzi.dagger.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {
    @Provides
    @Singleton
    fun provideDriver() = Driver()
}