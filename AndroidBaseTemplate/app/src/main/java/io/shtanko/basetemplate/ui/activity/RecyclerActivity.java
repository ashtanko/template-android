package io.shtanko.basetemplate.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import io.shtanko.basetemplate.R;
import io.shtanko.basetemplate.data.model.Action;
import io.shtanko.basetemplate.data.model.Item;
import io.shtanko.basetemplate.data.repository.ActionRepository;
import io.shtanko.basetemplate.data.repository.ActionRepositoryImpl;
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

    ActionRepositoryImpl actionRepository = new ActionRepositoryImpl();
    RecyclerAdapter adapter = new RecyclerAdapter(actionRepository.getActions(), R.layout.item_view);

    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(adapter);
  }
}
