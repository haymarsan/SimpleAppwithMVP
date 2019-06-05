package com.example.simpleappwithmvp.data.model

import com.example.simpleappwithmvp.data.vos.InputNameVO

interface INameInputModel {

    fun getInputName():InputNameVO
    fun insertInputName(name: String)

}