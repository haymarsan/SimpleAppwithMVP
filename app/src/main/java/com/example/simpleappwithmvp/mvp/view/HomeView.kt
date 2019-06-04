package com.example.simpleappwithmvp.mvp.view

import com.example.simpleappwithmvp.data.vos.InputNameVO

interface HomeView : BaseView {

    fun submitInputName(inputNameVO: InputNameVO)
    fun showNameOnScreen(inputNameVO: InputNameVO)

}