package io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Observable;
import io.shtanko.mavenclient.ApiService;
import io.shtanko.mavenclient.ApiTypes;
import io.shtanko.mavenclient.SearchResponse;

public class ApiManager implements ApiTypes {

  private ApiService apiService;
  private Gson gson;

  public ApiManager(ApiService apiService) {
    this.apiService = apiService;
    this.gson = new GsonBuilder().create();
  }

  @Override public Observable<SearchResponse> search(String name, int rows, String wt) {
    return apiService.search(name, rows, wt);
  }
}
