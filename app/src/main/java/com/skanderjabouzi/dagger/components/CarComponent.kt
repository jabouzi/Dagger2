package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Car
import com.skanderjabouzi.dagger.MainActivity
import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
    fun inject2Activity(mainActivity: MainActivity)
}
