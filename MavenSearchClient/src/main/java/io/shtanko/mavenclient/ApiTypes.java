package io.shtanko.mavenclient;

import io.reactivex.Observable;

public interface ApiTypes {

  public Observable<SearchResponse> search(String name, int rows, String wt);
}
