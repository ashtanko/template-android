package io.shtanko.mavenclient;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

  @GET("/solrsearch/select")
  Observable<SearchResponse> search(
      @Query("q") String name,
      @Query("rows") int rows,
      @Query("wt") String wt);
}
