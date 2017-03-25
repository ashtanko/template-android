package io.shtanko.mavenclient.cli;

import javax.inject.Inject;

public class Run {

  @Inject
  public Run(Startup startup) {
    startup.onStart();
  }
}
