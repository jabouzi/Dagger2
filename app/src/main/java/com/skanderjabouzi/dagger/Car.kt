package com.skanderjabouzi.dagger

import android.util.Log
import com.skanderjabouzi.engine.Engine
import com.skanderjabouzi.engine.extra.Nitro
import com.skanderjabouzi.wheels.Wheels
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels){

    @Inject
    fun addNitro(nitro: Nitro) {
        nitro.speedUp(this)
    }

    fun drive() {
        Log.e(TAG, "Vroooom... with Engine $engine and Wheels $wheels")
    }

    companion object {
        const val TAG = "CAR"
    }
}