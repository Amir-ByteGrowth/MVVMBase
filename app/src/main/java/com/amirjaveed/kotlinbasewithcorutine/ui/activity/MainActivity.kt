package com.amirjaveed.kotlinbasewithcorutine.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import com.amirjaveed.kotlinbasewithcorutine.BR
import com.amirjaveed.kotlinbasewithcorutine.R
import com.amirjaveed.kotlinbasewithcorutine.baseclasses.BaseActivity
import com.amirjaveed.kotlinbasewithcorutine.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val viewModel: Class<MainViewModel>
        get() = MainViewModel::class.java

    override val layoutId: Int
        get() = R.layout.activity_main

    override val bindingVariable: Int
        get() = BR.viewModel

    lateinit var progress_bar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialising()
    }

    private fun initialising() {
        progress_bar = findViewById(R.id.progress_bar)
    }

    open fun showProgressBar() {
        progress_bar.visibility = View.VISIBLE
    }

    open fun hideProgressBar() {
        progress_bar.visibility = View.GONE
    }

}