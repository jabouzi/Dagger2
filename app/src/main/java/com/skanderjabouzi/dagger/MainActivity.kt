package com.skanderjabouzi.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skanderjabouzi.dagger.components.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        val car = carComponent.getCar()
        car.engine.build()
        car.wheels.assemble()
        car.drive()
    }
}
