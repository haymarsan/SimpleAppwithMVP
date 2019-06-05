package com.example.simpleappwithmvp.mvp.view

import com.example.simpleappwithmvp.data.vos.InputNameVO

interface HomeView : BaseView {

    fun showNameOnScreen(inputNameVO: InputNameVO)

}