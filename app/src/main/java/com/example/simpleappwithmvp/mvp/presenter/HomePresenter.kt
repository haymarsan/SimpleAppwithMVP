package com.example.simpleappwithmvp.mvp.presenter

import com.example.simpleappwithmvp.data.model.NameInputModel
import com.example.simpleappwithmvp.data.vos.InputNameVO
import com.example.simpleappwithmvp.mvp.view.BaseView
import com.example.simpleappwithmvp.mvp.view.HomeView

class HomePresenter(val homeView: HomeView) : BasePresenter<HomeView>(), IHomePresenter {

    val nameInputModel: NameInputModel

   init {
       nameInputModel = NameInputModel.getInstance()
   }

    override fun onUIReady(name: String) {
        nameInputModel.insertInputName(name)
    }



    override fun onTapSubmit(inputNameVO: InputNameVO) {
        nameInputModel.getInputName()
        mView.showNameOnScreen(inputNameVO)
    }


}