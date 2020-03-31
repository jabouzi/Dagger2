package com.skanderjabouzi.dagger.wheels

import android.util.Log
import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.wheels.Wheels
import com.skanderjabouzi.wheels.parts.Rims
import com.skanderjabouzi.wheels.parts.Tires
import javax.inject.Inject
import javax.inject.Named

class SummerWheels @Inject constructor(override val tires: Tires, override val rims: Rims) : Wheels {

    var height: Int? = null
    var aspectRatio: Int? = null

    @Inject
    fun setHeight(@Named("height") height: Int) {
        this.height = height
        Log.e(Car.TAG, "Assemble Summer Weels with height = ${this.height}")
    }

    @Inject
    fun setAspectRatio(@Named("aspect ratio") aspectRatio: Int) {
        this.aspectRatio = aspectRatio
        Log.e(Car.TAG, "Assemble Summer Weels with aspect ratio  = ${this.aspectRatio}")
    }

    override fun assemble() {
        Log.e(Car.TAG, "Assemble Summer Weels with $tires and $rims height = $height and aspect ratio = $aspectRatio")
    }
}