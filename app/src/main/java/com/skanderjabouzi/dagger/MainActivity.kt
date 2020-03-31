package com.skanderjabouzi.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skanderjabouzi.dagger.engine.Engine
import com.skanderjabouzi.dagger.engine.parts.Block
import com.skanderjabouzi.dagger.engine.parts.Cylinders
import com.skanderjabouzi.dagger.engine.parts.SparkPlugs
import com.skanderjabouzi.dagger.wheels.Wheels
import com.skanderjabouzi.dagger.wheels.parts.Rims
import com.skanderjabouzi.dagger.wheels.parts.Tires

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val block = Block()
        val cylinders = Cylinders()
        val sparkPlugs = SparkPlugs()
        val engine = Engine(block, cylinders, sparkPlugs)
        engine.build()

        val tires = Tires()
        val rims = Rims()
        val wheels = Wheels(tires, rims)
        wheels.assemble()

        val car = Car(engine, wheels)
        car.drive()
    }
}
