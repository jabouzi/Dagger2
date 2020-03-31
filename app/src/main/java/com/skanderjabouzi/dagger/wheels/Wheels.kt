package com.skanderjabouzi.dagger.wheels

import android.util.Log
import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.wheels.parts.Rims
import com.skanderjabouzi.dagger.wheels.parts.Tires

class Wheels constructor(val tires: Tires, val rims: Rims){
    fun assemble() {
        Log.e(Car.TAG, "Assemble Weels with $tires and $rims")
    }
}