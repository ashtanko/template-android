package io.shtanko.featuretemplate.presenter;

import android.support.annotation.NonNull;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BasePresenter<V extends MvpView> extends MvpPresenter<V> {
  CompositeDisposable compositeDisposable = new CompositeDisposable();

  protected void unsubscribeOnDestroy(@NonNull Disposable disposable) {
    compositeDisposable.add(disposable);
  }

  @Override public void onDestroy() {
    super.onDestroy();
    compositeDisposable.clear();
  }
}
