package io.shtanko.mavenclient;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {MainModule.class, NetworkModule.class})
public interface MainComponent {
  Run run();
}
