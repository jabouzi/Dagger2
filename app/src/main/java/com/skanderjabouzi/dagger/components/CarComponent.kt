package com.skanderjabouzi.dagger.components

import com.skanderjabouzi.dagger.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}
