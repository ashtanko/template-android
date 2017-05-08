package io.shtanko.mavenclient.injection.component;

import dagger.Component;
import io.shtanko.mavenclient.cli.Run;
import io.shtanko.mavenclient.injection.module.MainModule;
import io.shtanko.mavenclient.injection.module.NetworkModule;
import javax.inject.Singleton;

@Singleton
@Component(modules = {MainModule.class, NetworkModule.class})
public interface MainComponent {
  Run run();
}
