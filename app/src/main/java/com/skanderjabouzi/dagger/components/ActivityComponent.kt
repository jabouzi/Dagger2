package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.MainActivity
import com.skanderjabouzi.dagger.PerActivity
import com.skanderjabouzi.dagger.modules.EngineModule
import com.skanderjabouzi.dagger.modules.SummerWheelsModule
import com.skanderjabouzi.dagger.modules.WinterWheelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [EngineModule::class, WinterWheelsModule::class])
interface ActivityComponent {
    fun getCar(): Car
    fun inject2Activity(mainActivity: MainActivity)
}
