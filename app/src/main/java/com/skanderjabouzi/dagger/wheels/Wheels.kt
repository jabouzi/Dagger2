package com.skanderjabouzi.dagger.wheels

import android.util.Log
import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.wheels.parts.Rims
import com.skanderjabouzi.dagger.wheels.parts.Tires
import javax.inject.Inject

class Wheels @Inject constructor(val tires: Tires) {

    @Inject
    lateinit var rims: Rims

    fun assemble() {
        Log.e(Car.TAG, "Assemble Weels with $tires and $rims")
    }
}