package io.shtanko.mavenclient.net;

import io.reactivex.Observable;
import io.shtanko.mavenclient.data.model.SearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

  @GET("/solrsearch/select")
  Observable<SearchResponse> search(
      @Query("q") String name,
      @Query("rows") int rows,
      @Query("wt") String wt);
}
