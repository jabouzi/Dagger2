package com.skanderjabouzi.dagger

import android.app.Application
import com.skanderjabouzi.dagger.components.AppComponent
import com.skanderjabouzi.dagger.components.DaggerAppComponent

class CarApplication: Application() {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
}