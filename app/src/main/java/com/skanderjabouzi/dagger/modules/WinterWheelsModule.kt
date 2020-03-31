package com.skanderjabouzi.dagger.modules

import com.skanderjabouzi.dagger.wheels.WinterWheels
import com.skanderjabouzi.wheels.Wheels
import com.skanderjabouzi.wheels.parts.Rims
import com.skanderjabouzi.wheels.parts.Tires
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class WinterWheelsModule {

    @Binds
    abstract fun bindWheels(winterWheels: WinterWheels): Wheels

    companion object {
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTires(): Tires {
            return Tires()
        }
    }
}