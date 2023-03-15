package com.example.shopping_list2.presentation

import android.app.Activity
import android.app.Application
import com.example.shopping_list2.di.DaggerApplicationComponent

class ShopApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this)
    }
}