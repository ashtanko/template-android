package io.shtanko.storagetemplate.data.model;

import io.realm.RealmObject;

public class Model extends RealmObject {
  private String name;

  public String getName() {
    return name;
  }
}
