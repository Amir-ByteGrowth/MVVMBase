package com.amirjaveed.kotlinbasewithcorutine.ui.activity

import com.amirjaveed.kotlinbasewithcorutine.baseclasses.BaseViewModel
import com.amirjaveed.kotlinbasewithcorutine.data.remote.reporitory.MainRepository
import com.amirjaveed.kotlinbasewithcorutine.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : BaseViewModel() {


}
