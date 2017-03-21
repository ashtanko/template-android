package io.shtanko.featuretemplate.di.component;

import dagger.Component;
import io.shtanko.featuretemplate.di.module.NavigationModule;
import io.shtanko.featuretemplate.ui.activity.MainActivity;
import io.shtanko.featuretemplate.di.module.AppModule;
import io.shtanko.featuretemplate.di.module.NetModule;
import javax.inject.Singleton;

@Singleton @Component(modules = { AppModule.class, NetModule.class, NavigationModule.class })
public interface AppComponent {
  void inject(MainActivity activity);
}
