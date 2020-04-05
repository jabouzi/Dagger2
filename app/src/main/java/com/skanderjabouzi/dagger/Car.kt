package com.skanderjabouzi.dagger

import android.util.Log
import com.skanderjabouzi.engine.Engine
import com.skanderjabouzi.engine.extra.Nitro
import com.skanderjabouzi.wheels.Wheels
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(val driver: Driver, val engine: Engine, val wheels: Wheels){

    @Inject
    fun addNitro(nitro: Nitro) {
        nitro.speedUp(this)
    }

    fun drive() {
        Log.e(TAG, "$driver drives $this")
    }

    companion object {
        const val TAG = "CAR"
    }
}