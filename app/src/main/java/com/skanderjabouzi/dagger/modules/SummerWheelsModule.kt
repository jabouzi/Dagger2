package com.skanderjabouzi.dagger.modules

import com.skanderjabouzi.dagger.wheels.SummerWheels
import com.skanderjabouzi.dagger.wheels.WinterWheels
import com.skanderjabouzi.wheels.Wheels
import dagger.Binds
import dagger.Module

@Module
abstract class SummerWheelsModule {
    @Binds
    abstract fun bindWheels(summerWheels: SummerWheels): Wheels
}