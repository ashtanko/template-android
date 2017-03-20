package io.shtanko.basetemplate.data.model;

import java.util.ArrayList;
import java.util.List;

public class Action {

  private int actionNumber;
  private List<Item> items = new ArrayList<>();

  public int getActionNumber() {
    return actionNumber;
  }

  public void setActionNumber(int actionNumber) {
    this.actionNumber = actionNumber;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }
}
