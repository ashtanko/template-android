package io.shtanko.drmvptemplate.di.module;

import dagger.Module;
import dagger.Provides;
import io.shtanko.drmvptemplate.App;
import javax.inject.Singleton;

@Module public class AppModule {

  App app;

  public AppModule(App app) {
    this.app = app;
  }

  @Provides @Singleton App provideApp() {
    return app;
  }
}
