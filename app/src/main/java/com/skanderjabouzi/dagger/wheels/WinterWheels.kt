package com.skanderjabouzi.dagger.wheels

import android.util.Log
import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.wheels.Wheels
import com.skanderjabouzi.wheels.parts.Rims
import com.skanderjabouzi.wheels.parts.Tires
import javax.inject.Inject

class WinterWheels @Inject constructor(override val tires: Tires, override val rims: Rims) : Wheels {

    private var horsePower: Int? = null

    fun setHorsePower(horsePower: Int) {
        this.horsePower = horsePower
    }

    override fun assemble() {
        Log.e(Car.TAG, "Assemble Winter Weels with $tires and $rims with horsePower = $horsePower")
    }
}