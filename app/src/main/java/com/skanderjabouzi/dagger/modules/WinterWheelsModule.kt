package com.skanderjabouzi.dagger.modules

import com.skanderjabouzi.dagger.wheels.WinterWheels
import com.skanderjabouzi.wheels.Wheels
import com.skanderjabouzi.wheels.parts.Rims
import com.skanderjabouzi.wheels.parts.Tires
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class WinterWheelsModule constructor(val height: Int){

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        return Tires()
    }

    @Provides
    fun ProvidesWheels(rims: Rims, tires: Tires): Wheels {
        val wheels = WinterWheels(tires, rims)
        wheels.height = height
        return wheels
    }
}