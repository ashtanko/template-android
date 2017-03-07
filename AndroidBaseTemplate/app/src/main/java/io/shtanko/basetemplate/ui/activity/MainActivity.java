package io.shtanko.basetemplate.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.shtanko.basetemplate.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
