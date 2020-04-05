package com.skanderjabouzi.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skanderjabouzi.dagger.components.DaggerActivityComponent
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

        val activityComponent = DaggerActivityComponent.builder().appComponent((application as CarApplication).component)
            .winterWheelsModule(WinterWheelsModule(100)).build()
        activityComponent.inject2Activity(this)

        car1.engine.build()
        car1.wheels.assemble()
        car1.drive()

        car2.engine.build()
        car2.wheels.assemble()
        car2.drive()
    }
}
