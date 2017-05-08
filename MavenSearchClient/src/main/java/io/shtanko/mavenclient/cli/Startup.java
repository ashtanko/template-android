package io.shtanko.mavenclient.cli;

import io.shtanko.mavenclient.net.ApiManager;
import java.io.IOException;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;

public class Startup {

  @Inject ApiManager apiManager;
  @Inject OkHttpClient okHttpClient;
  @Inject Retrofit retrofit;

  @Inject public Startup() {

  }

  void onStart() {
    //try {
    //  post();
    //} catch (IOException e) {
    //  e.printStackTrace();
    //}

    System.out.println("ON START: " + retrofit.baseUrl() + " " + retrofit.converterFactories());

    apiManager.search("dagger", 50, "json")
        .subscribe(searchResponse -> {

          if (searchResponse.getResponse().getDocs() != null) {

            searchResponse.getResponse().getDocs().forEach(doc -> {
              System.out.println("DOC: "+doc.getId() + " "+doc.getLatestVersion());
            });
          }

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
