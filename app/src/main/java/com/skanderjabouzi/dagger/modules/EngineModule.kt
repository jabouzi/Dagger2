package com.skanderjabouzi.dagger.modules

import com.skanderjabouzi.engine.Engine
import com.skanderjabouzi.engine.extra.Nitro
import com.skanderjabouzi.engine.parts.Block
import com.skanderjabouzi.engine.parts.Cylinders
import com.skanderjabouzi.engine.parts.SparkPlugs
import dagger.Module
import dagger.Provides

@Module
class EngineModule {
    @Provides
    fun provideNitro(): Nitro {
        return Nitro()
    }

    @Provides
    fun provideBlock(): Block {
        return Block()
    }

    @Provides
    fun provideCylinders(): Cylinders {
        return Cylinders()
    }

    @Provides
    fun provideSparkPlugs(): SparkPlugs {
        return SparkPlugs()
    }

    @Provides
    fun provideEngine(block: Block, cylinders: Cylinders, sparkPlugs: SparkPlugs): Engine {
        return Engine(block, cylinders, sparkPlugs)
    }
}