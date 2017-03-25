package io.shtanko.mavenclient.net;

import io.reactivex.Observable;
import io.shtanko.mavenclient.data.model.SearchResponse;

public interface ApiTypes {

  public Observable<SearchResponse> search(String name, int rows, String wt);
}
