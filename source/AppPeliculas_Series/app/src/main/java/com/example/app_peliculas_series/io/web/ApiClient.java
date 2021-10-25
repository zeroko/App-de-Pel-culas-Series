package com.example.app_peliculas_series.io.web;

import com.example.app_peliculas_series.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static ApiClient apiClient;
    private OkHttpClient.Builder okBuilder;
    private Retrofit.Builder adapterBuilder;
    private static final long TIMEOUT = 1000;

    private ApiClient() {
        createDefaultAdapter();
    }

    /**
     * Este método configura el cliente con la api deseada a través del parámetro serviceClass
     *
     * @param serviceClass es la interfaz Api que se utilizará
     * @param <S>
     * @return
     */
    public <S> S createService(Class<S> serviceClass) {
        return adapterBuilder
                .client(okBuilder.build())
                .build()
                .create(serviceClass);
    }

    private void createDefaultAdapter() {
        // Configuración de Http log
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        okBuilder = new OkHttpClient.Builder();
        okBuilder.addInterceptor(logging);
        // Se configura retrofit
        adapterBuilder = new Retrofit.
                Builder()
                .client(okBuilder
                        .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                        .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                        .build())
                .baseUrl(BuildConfig.URL)
                .addConverterFactory(GsonConverterFactory.create());
    }

    // Se crea instancia de nuestra clase
    public static ApiClient getInstance() {
        if (apiClient == null) {
            apiClient = new ApiClient();
        }
        return apiClient;
    }
}
