package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.MainActivity
import com.skanderjabouzi.dagger.modules.EngineModule
import com.skanderjabouzi.dagger.modules.WinterWheelsModule
import dagger.Component

@Component(modules = [EngineModule::class, WinterWheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject2Activity(mainActivity: MainActivity)
}
