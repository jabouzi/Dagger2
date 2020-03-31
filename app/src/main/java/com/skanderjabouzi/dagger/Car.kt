package com.skanderjabouzi.dagger

import android.util.Log

class Car constructor(val engine: Engine, val wheels: Wheels){

    fun drive() {
        Log.e(TAG, "Vroooom... with Engine $engine and Wheels $wheels")
    }

    companion object {
        const val TAG = "CAR"
    }
}