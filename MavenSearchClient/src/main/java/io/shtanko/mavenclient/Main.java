package io.shtanko.mavenclient;

public class Main {

  public static void main(String... args) {

    MainComponent mainComponent =
        DaggerMainComponent.builder()
            .networkModule(new NetworkModule("http://search.maven.org/"))
            .build();
    mainComponent.run();
  }
}
