package com.example.simpleappwithmvp.mvp.presenter

import android.view.View
import com.example.simpleappwithmvp.mvp.view.BaseView

abstract class BasePresenter <T: BaseView> : IBasePresenter{


 lateinit var mView: T


    fun initView (view: T){
        mView = view
    }


}