package com.example.simpleappwithmvp

import android.app.Application
import com.example.simpleappwithmvp.data.model.NameInputModel

class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        NameInputModel.initModel(applicationContext)
    }
}