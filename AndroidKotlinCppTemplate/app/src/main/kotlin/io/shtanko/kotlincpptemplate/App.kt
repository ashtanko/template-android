package io.shtanko.kotlincpptemplate

import android.app.Application
import io.shtanko.kotlincpptemplate.utils.initNative

class App : Application() {

  override fun onCreate() {
    super.onCreate()
    initNative(this)
  }

}