package com.example.luuu.luuuproject

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.luuu.luuuproject.ViewModel.MainViewModel
import com.example.luuu.luuuproject.databinding.ActivityMvvmBinding

/**
 * Created by weiwei on 17-11-20.
 */
class MVVMActivity :AppCompatActivity() {

    lateinit var binding : ActivityMvvmBinding

    var viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_mvvm)
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }

}