package io.shtanko.mavenclient.net;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import io.shtanko.mavenclient.data.model.SearchResponse;

public class ApiManager implements ApiTypes {

  private ApiService apiService;

  public ApiManager(ApiService apiService) {
    this.apiService = apiService;
  }

  @Override public Observable<SearchResponse> search(String name, int rows, String wt) {
    return apiService.search(name, rows, wt).subscribeOn(Schedulers.io());
  }
}
