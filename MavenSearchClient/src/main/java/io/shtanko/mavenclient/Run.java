package io.shtanko.mavenclient;

import javax.inject.Inject;

public class Run {

  @Inject
  public Run(Startup startup) {
    startup.onStart();
  }
}
