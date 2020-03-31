package com.skanderjabouzi.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skanderjabouzi.dagger.components.DaggerCarComponent
import com.skanderjabouzi.dagger.modules.WinterWheelsModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder().winterWheelsModule(WinterWheelsModule(100)).build()
        carComponent.inject2Activity(this)
        car.engine.build()
        car.wheels.assemble()
        car.drive()
    }
}
