package io.shtanko.drmvptemplate.di.component;

import dagger.Component;
import io.shtanko.drmvptemplate.MainActivity;
import io.shtanko.drmvptemplate.di.module.AppModule;
import io.shtanko.drmvptemplate.di.module.NetModule;
import javax.inject.Singleton;

@Singleton @Component(modules = { AppModule.class, NetModule.class })
public interface AppComponent {
  void inject(MainActivity activity);
}
