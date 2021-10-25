package com.example.app_peliculas_series.base.mvp;

public interface InterfacePresenter<V extends InterfaceView> {
    void attach(V view);
}
