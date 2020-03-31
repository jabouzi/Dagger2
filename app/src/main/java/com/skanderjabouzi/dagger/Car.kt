package com.skanderjabouzi.dagger

import android.util.Log
import com.skanderjabouzi.dagger.engine.Engine
import com.skanderjabouzi.dagger.wheels.Wheels
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels){

    fun drive() {
        Log.e(TAG, "Vroooom... with Engine $engine and Wheels $wheels")
    }

    companion object {
        const val TAG = "CAR"
    }
}