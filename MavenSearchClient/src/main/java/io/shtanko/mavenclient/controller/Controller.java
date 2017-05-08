package io.shtanko.mavenclient.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.shtanko.mavenclient.data.model.SearchResponse;
import io.shtanko.mavenclient.net.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<SearchResponse> {

  static final String BASE_URL = "http://search.maven.org/";

  public void start() {

    Gson gson = new GsonBuilder()
        .setLenient()
        .create();

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build();

    ApiService apiService = retrofit.create(ApiService.class);
    Call<SearchResponse> call = apiService.searchCall("dagger", 20, "json");
    call.enqueue(this);
  }

  @Override public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
    System.out.println("onResponse".toUpperCase() + " " + response.body().getResponse().getDocs());
  }

  @Override public void onFailure(Call<SearchResponse> call, Throwable t) {
    System.out.println("onFailure".toUpperCase() + " " + call.request());
  }
}
