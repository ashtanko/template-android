package io.shtanko.mavenclient;

public class Main {

  public static void main(String... args) {

    MainComponent mainComponent = DaggerMainComponent.create();

    System.out.println(mainComponent);

  }
}
