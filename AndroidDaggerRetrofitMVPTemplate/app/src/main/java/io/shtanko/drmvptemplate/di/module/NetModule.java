package io.shtanko.drmvptemplate.di.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import io.shtanko.drmvptemplate.App;
import javax.inject.Singleton;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module public class NetModule {

  String baseURL = "";

  public NetModule(String baseURL) {
    this.baseURL = baseURL;
  }

  @Provides @Singleton SharedPreferences providesSharedPreferences(App app) {
    return PreferenceManager.getDefaultSharedPreferences(app);
  }

  @Provides @Singleton Cache provideOkHttpCache(App app) {
    int cacheSize = 10 * 1024 * 1024; // 10 MiB
    Cache cache = new Cache(app.getCacheDir(), cacheSize);
    return cache;
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
    Retrofit retrofit =
        new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(baseURL)
            .client(okHttpClient)
            .build();
    return retrofit;
  }
}
