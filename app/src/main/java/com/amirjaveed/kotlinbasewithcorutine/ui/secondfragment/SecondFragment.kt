package com.amirjaveed.kotlinbasewithcorutine.ui.secondfragment

import com.amirjaveed.kotlinbasewithcorutine.BR
import com.amirjaveed.kotlinbasewithcorutine.R
import com.amirjaveed.kotlinbasewithcorutine.baseclasses.BaseFragment
import com.amirjaveed.kotlinbasewithcorutine.databinding.LayoutSecondBinding

class SecondFragment : BaseFragment<LayoutSecondBinding, SecondViewModel>() {

    override val layoutId: Int
        get() = R.layout.layout_second
    override val viewModel: Class<SecondViewModel>
        get() = SecondViewModel::class.java
    override val bindingVariable: Int
        get() = BR.viewModel
}