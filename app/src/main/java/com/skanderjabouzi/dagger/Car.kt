package com.skanderjabouzi.dagger

import android.util.Log
import com.skanderjabouzi.dagger.engine.Engine
import com.skanderjabouzi.dagger.wheels.Wheels

class Car constructor(val engine: Engine, val wheels: Wheels){

    fun drive() {
        Log.e(TAG, "Vroooom... with Engine $engine and Wheels $wheels")
    }

    companion object {
        const val TAG = "CAR"
    }
}