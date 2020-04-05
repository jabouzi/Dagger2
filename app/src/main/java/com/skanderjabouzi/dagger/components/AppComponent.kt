package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Driver
import com.skanderjabouzi.dagger.modules.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver(): Driver
}