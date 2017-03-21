package io.shtanko.featuretemplate.di.module;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import io.shtanko.featuretemplate.App;
import javax.inject.Singleton;

@Module public class AppModule {

  private App app;

  public AppModule(App app) {
    this.app = app;
  }

  @Provides @Singleton App provideApp() {
    return app;
  }
}
