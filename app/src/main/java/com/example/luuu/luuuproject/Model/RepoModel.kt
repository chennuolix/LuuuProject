package com.example.luuu.luuuproject.Model

import android.os.Handler


/**
 * Created by weiwei on 17-11-20.
 */
class RepoModel {

    fun refreshData(onDataReadyCallBack: OnDataReadyCallBack){
        Handler().postDelayed({onDataReadyCallBack.onDataReady("new data")},2000)
    }

}

interface OnDataReadyCallBack{
    fun onDataReady(data:String)
}