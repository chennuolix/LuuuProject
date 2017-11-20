package com.example.luuu.luuuproject

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.luuu.luuuproject.Module.Repository
import com.example.luuu.luuuproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.apply {
//            repositoryName.text = "LuuuProject"
//            repositoryHasIssues.text = "no"
//            repositoryOwner.text = "Luuu"
//        }
        var repository = Repository("LuuuProject Repository", "Luuu", 100, true)
        repository.repositoryName = "LuuuProject Repository"
        binding.repository = repository
        binding.executePendingBindings()
        Handler().postDelayed({ repository.repositoryName = "New Name" }, 2000)
    }
}
