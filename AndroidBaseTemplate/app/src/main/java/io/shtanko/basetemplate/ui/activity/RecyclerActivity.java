package io.shtanko.basetemplate.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import io.shtanko.basetemplate.R;
import io.shtanko.basetemplate.model.Action;
import io.shtanko.basetemplate.model.Item;
import io.shtanko.basetemplate.ui.adapter.RecyclerAdapter;
import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends BaseActivity {

  @Override protected int layoutRes() {
    return R.layout.activity_recycler;
  }

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

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

    RecyclerAdapter adapter = new RecyclerAdapter(actions, R.layout.item_view);

    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(adapter);
  }
}
