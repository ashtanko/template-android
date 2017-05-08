package io.shtanko.mavenclient;

import io.shtanko.mavenclient.controller.Controller;
import io.shtanko.mavenclient.injection.component.DaggerMainComponent;
import io.shtanko.mavenclient.injection.component.MainComponent;
import io.shtanko.mavenclient.injection.module.NetworkModule;

public class Main {

  public static void main(String... args) {

    MainComponent mainComponent =
        DaggerMainComponent.builder()
            .networkModule(new NetworkModule("http://search.maven.org/"))
            .build();
   // mainComponent.run();

    Controller controller = new Controller();
    controller.start();
  }
}
