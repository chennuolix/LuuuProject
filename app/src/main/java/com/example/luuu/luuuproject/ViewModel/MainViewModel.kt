package com.example.luuu.luuuproject.ViewModel

import android.databinding.ObservableField
import com.example.luuu.luuuproject.Model.OnDataReadyCallBack
import com.example.luuu.luuuproject.Model.RepoModel

/**
 * Created by weiwei on 17-11-20.
 */
class MainViewModel {
    var repoModel:RepoModel = RepoModel()
    val text: ObservableField<String> = ObservableField()
    val isLoading: ObservableField<Boolean> = ObservableField()

    fun refresh(){
        isLoading.set(true)
        repoModel.refreshData(object :OnDataReadyCallBack{
            override fun onDataReady(data: String) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                isLoading.set(false)
                text.set(data)
            }
        })
    }
}