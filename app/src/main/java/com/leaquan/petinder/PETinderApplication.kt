package com.leaquan.petinder

import android.app.Application
import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.leaquan.petinder.di.appModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

/**
 * SET UP BRANCH GIT COMP
 * SET UP GIT BRANCH HOME
 **/

//when extends Application must declare in Manifest
class PETinderApplication : Application(), KodeinAware {

    //bind to kodein instance in application class.
    override val kodein = Kodein.lazy {
        import(androidXModule((this@PETinderApplication)))
        import(appModule)
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        //this field are immediately made visible to other threads.
        @Volatile
        private var instance: PETinderApplication? = null

        //static methods for functions
        @JvmStatic
        fun getInstance(): PETinderApplication = instance ?: synchronized(this) {
            instance ?: PETinderApplication().also {
                instance = it
            }
        }
        fun getString(@StringRes strId: Int): String {
            return getResources().getString(strId)
        }

        fun getDrawableResource(@DrawableRes drawableRes: Int): Drawable? {
            return ContextCompat.getDrawable(getInstance(), drawableRes)
        }

        fun getResources(): Resources {
            return getInstance().resources
        }
    }

}