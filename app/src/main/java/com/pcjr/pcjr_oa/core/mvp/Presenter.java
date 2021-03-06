package com.pcjr.pcjr_oa.core.mvp;

/**
 * Created by Mario on 2016/7/8.
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
