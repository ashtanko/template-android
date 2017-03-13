package io.shtanko.cpptemplate;

import android.app.Application;

public class App extends Application {

  @Override public void onCreate() {
    super.onCreate();
    try {
      System.loadLibrary("main");
    } catch (Error e) {
      e.printStackTrace();
    }
  }
}
