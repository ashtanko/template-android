package io.shtanko.basetemplate.data.repository;

import io.shtanko.basetemplate.data.model.Action;
import io.shtanko.basetemplate.data.model.Item;
import java.util.ArrayList;
import java.util.List;

public class ActionRepositoryImpl implements ActionRepository {

  @Override public List<Action> getActions() {

    List<Action> actions = new ArrayList<>();

    for (int i = 0; i < 1200; i++) {
      List<Item> items = new ArrayList<>();
      Item item = new Item();
      item.setTitle("item_view => " + i);
      item.setDescription("" + Math.sqrt(i));
      item.setPrice(Math.max(i, i - 1));
      item.setQuantity(i);
      items.add(item);
      Action action = new Action();
      action.setActionNumber(i);
      action.setItems(items);
      actions.add(action);
    }

    return actions;
  }
}
