package io.shtanko.drmvptemplate;

import android.app.Application;
import io.shtanko.drmvptemplate.di.component.AppComponent;
import io.shtanko.drmvptemplate.di.component.DaggerAppComponent;

public class App extends Application {

  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();

    appComponent = DaggerAppComponent.builder().build();
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }
}
