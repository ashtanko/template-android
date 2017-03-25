package io.shtanko.mavenclient.injection.module;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import io.shtanko.mavenclient.net.ApiManager;
import io.reactivex.schedulers.Schedulers;
import io.shtanko.mavenclient.net.ApiService;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

  String baseURL;

  public NetworkModule(String baseURL) {
    this.baseURL = baseURL;
  }

  @Provides @Singleton Gson provideGson() {
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
    return gsonBuilder.create();
  }

  @Provides @Singleton HttpLoggingInterceptor provideHttpLoggingInterceptor() {
    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
    httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    return httpLoggingInterceptor;
  }

  @Provides @Singleton OkHttpClient provideOkHttpClient(
      HttpLoggingInterceptor httpLoggingInterceptor) {
    OkHttpClient client =
        new OkHttpClient.Builder().addNetworkInterceptor(httpLoggingInterceptor).build();
    return client;
  }

  @Provides @Singleton Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
    RxJava2CallAdapterFactory rxAdapter =
        RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());
    Retrofit retrofit =
        new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(rxAdapter)
            .client(okHttpClient)
            .build();
    return retrofit;
  }

  @Provides @Singleton ApiService provideApiService(Retrofit retrofit) {
    return retrofit.create(ApiService.class);
  }

  @Provides @Singleton ApiManager provideApiManager(ApiService apiService) {
    return new ApiManager(apiService);
  }
}
