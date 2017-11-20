package com.example.luuu.luuuproject.Module

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.luuu.luuuproject.BR

/**
 * Created by weiwei on 17-11-15.
 */
class Repository(repositoryName: String?, var repositoryOwner: String?, var numberOfStars: Int?, var hasIssues: Boolean = false) : BaseObservable() {
    @get:Bindable
    var repositoryName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.repositoryName)
        }
}