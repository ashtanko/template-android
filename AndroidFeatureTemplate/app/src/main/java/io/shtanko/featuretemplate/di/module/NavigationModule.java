package io.shtanko.featuretemplate.di.module;

import com.arellomobile.mvp.presenter.ProvidePresenter;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import ru.terrakok.cicerone.Cicerone;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;

@Module public class NavigationModule {

  private Cicerone<Router> instance;

  public NavigationModule() {
    instance = Cicerone.create();
  }

  @Provides @Singleton Router provideRouter() {
    return instance.getRouter();
  }

  @Provides @Singleton NavigatorHolder provideNavigationHolder() {
    return instance.getNavigatorHolder();
  }
}
