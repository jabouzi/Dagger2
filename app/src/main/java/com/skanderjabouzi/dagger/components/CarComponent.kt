package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.MainActivity
import com.skanderjabouzi.dagger.modules.EngineModule
import com.skanderjabouzi.dagger.modules.SummerWheelsModule
import com.skanderjabouzi.dagger.modules.WinterWheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [EngineModule::class, SummerWheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject2Activity(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun height(@Named("height") height: Int): Builder

        @BindsInstance
        fun aspectRatio(@Named("aspect ratio") aspectRatio: Int): Builder

        fun build(): CarComponent?
    }
}
