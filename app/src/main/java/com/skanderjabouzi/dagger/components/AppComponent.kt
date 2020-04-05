package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Driver
import com.skanderjabouzi.dagger.modules.DriverModule
import com.skanderjabouzi.dagger.modules.WinterWheelsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponent(winterWheelsModule: WinterWheelsModule): ActivityComponent
}