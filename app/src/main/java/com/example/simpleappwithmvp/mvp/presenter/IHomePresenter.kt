package com.example.simpleappwithmvp.mvp.presenter

import com.example.simpleappwithmvp.data.vos.InputNameVO

interface IHomePresenter {

    fun onUIReady(name: String)
    fun onTapSubmit(inputNameVO: InputNameVO)
}