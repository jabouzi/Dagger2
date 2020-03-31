package com.skanderjabouzi.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skanderjabouzi.dagger.components.DaggerCarComponent
import com.skanderjabouzi.dagger.modules.WinterWheelsModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .height(255)
            .aspectRatio(17)
            .build()

        carComponent?.inject2Activity(this)
        car1.engine.build()
        car1.wheels.assemble()
        car1.drive()

        car2.engine.build()
        car2.wheels.assemble()
        car2.drive()
    }
}
