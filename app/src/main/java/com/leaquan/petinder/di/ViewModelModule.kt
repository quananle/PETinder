package com.leaquan.petinder.di


import androidx.lifecycle.ViewModelProvider
import com.leaquan.petinder.ui.login.login.LoginViewModel
import com.leaquan.petinder.util.view_model.ViewModelFactory
import com.leaquan.petinder.util.view_model.bindViewModel
import org.kodein.di.Kodein
import org.kodein.di.direct
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

const val VIEW_MODEL_MODULE = "view_model_module"

val viewModelModule = Kodein.Module(VIEW_MODEL_MODULE, false) {

    bind<ViewModelProvider.Factory>() with singleton { ViewModelFactory(kodein.direct) }

    bindViewModel<LoginViewModel>() with provider { LoginViewModel() }

}