package com.example.app_peliculas_series;

import android.app.Application;

import com.example.app_peliculas_series.io.web.ApiClient;

public class App extends Application {
    public static ApiClient apiManager;

    @Override
    public void onCreate() {
        super.onCreate();
        apiManager=ApiClient.getInstance();
    }
}
