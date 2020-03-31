package com.skanderjabouzi.dagger.engine

import android.util.Log
import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.engine.parts.Block
import com.skanderjabouzi.dagger.engine.parts.Cylinders
import com.skanderjabouzi.dagger.engine.parts.SparkPlugs

class Engine constructor(val block: Block, val cylinders: Cylinders, val sparkPlugs: SparkPlugs ){
    fun build() {
        Log.e(Car.TAG, "Building Engine with $block, $cylinders amd $sparkPlugs")
    }
}