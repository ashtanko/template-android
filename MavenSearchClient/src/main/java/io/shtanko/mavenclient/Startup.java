package io.shtanko.mavenclient;

import io.ApiManager;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import javax.inject.Inject;
import okhttp3.*;

public class Startup {

  @Inject ApiManager apiManager;
  @Inject OkHttpClient okHttpClient;

  @Inject public Startup() {
  }

  public void onStart() {
    try {
      post();
    } catch (IOException e) {
      e.printStackTrace();
    }

    apiManager.search("dagger", 0, "json")
        .subscribeOn(Schedulers.newThread())
        .observeOn(Schedulers.io())
        .subscribe(searchResponse -> {
          System.out.println("RESPONSE: " + searchResponse.getResponse());
        }, throwable -> {
          System.out.println("THROW: " + throwable.getMessage());
        });
  }

  void post() throws IOException {
    Request request = new Request.Builder().url(
        "http://search.maven.org/solrsearch/select?q=guice&rows=1&wt=json").build();
    okhttp3.Response response = okHttpClient.newCall(request).execute();
    System.out.println("BODY: " + response.body().string());
  }
}
