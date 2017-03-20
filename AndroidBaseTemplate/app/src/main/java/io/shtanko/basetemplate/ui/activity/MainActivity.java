package io.shtanko.basetemplate.ui.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.shtanko.basetemplate.R;

public class MainActivity extends BaseActivity {

  @Override protected int layoutRes() {
    return R.layout.activity_main;
  }

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }
}
