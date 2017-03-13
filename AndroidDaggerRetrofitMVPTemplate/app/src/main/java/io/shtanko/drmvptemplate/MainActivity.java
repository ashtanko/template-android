package io.shtanko.drmvptemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Objects;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

  @Inject OkHttpClient okClient;
  @Inject Retrofit retrofit;
  @Inject Gson gson;

  @Override protected void onCreate(Bundle savedInstanceState) {
    ((App) getApplication()).getAppComponent().inject(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    checkDependencies();
  }

  private void checkDependencies() {
    SimpleLogger.v(null);
    SimpleLogger.v();
    SimpleLogger.v(okClient);
    SimpleLogger.v(retrofit);
    SimpleLogger.v(gson);
  }

  private static class SimpleLogger {
    private static final String TAG = "MAIN ACTIVITY";

    static void v(Object... args) {
      Log.v(TAG, Arrays.toString(args));
    }
  }
}