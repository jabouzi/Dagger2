package com.skanderjabouzi.wheels

import com.skanderjabouzi.wheels.parts.Rims
import com.skanderjabouzi.wheels.parts.Tires

interface Wheels {
    val tires: Tires
    val rims: Rims
    fun assemble()
}
