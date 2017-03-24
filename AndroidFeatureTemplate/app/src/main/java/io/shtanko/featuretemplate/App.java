package io.shtanko.featuretemplate;

import android.app.Application;
import io.shtanko.featuretemplate.di.component.AppComponent;
//import io.shtanko.featuretemplate.di.component.DaggerAppComponent;
import io.shtanko.featuretemplate.di.module.NetModule;

public class App extends Application {

  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();

   // appComponent =
     //       DaggerAppComponent.builder().netModule(new NetModule("https://api.github.com")).build();
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }
}
