package com.skanderjabouzi.engine

import com.skanderjabouzi.engine.parts.Block
import com.skanderjabouzi.engine.parts.Cylinders
import com.skanderjabouzi.engine.parts.SparkPlugs

class Engine constructor(val block: Block, val cylinders: Cylinders, val sparkPlugs: SparkPlugs){

    fun build() {
        println("Building Engine with $block, $cylinders and $sparkPlugs")
    }
}