package io.shtanko.kotlincpptemplate.utils

import android.content.Context

val NATIVE_LIBRARY_NAME = "native-lib"
val NATIVE_LIBRARY_SO_NAME = "lib$NATIVE_LIBRARY_NAME.so"

public fun initNative(context: Context) {
  try {
    System.loadLibrary(NATIVE_LIBRARY_NAME)
  } catch (e: Error) {
    e.printStackTrace()
  }

}