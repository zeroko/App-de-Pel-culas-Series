package com.example.app_peliculas_series.base.mvp;

public class BasePresenter<V extends InterfaceView> implements InterfacePresenter<V> {
    private V view;

    @Override
    public void attach(V view) {
        this.view = view;
    }

    protected V getView() {
        return this.view;
    }
}