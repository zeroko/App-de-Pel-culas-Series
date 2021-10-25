package com.example.app_peliculas_series.ui.token;

import static com.example.app_peliculas_series.App.apiManager;

import com.example.app_peliculas_series.BuildConfig;
import com.example.app_peliculas_series.base.mvp.BasePresenter;
import com.example.app_peliculas_series.io.web.api.ApiAuth;
import com.example.app_peliculas_series.io.web.model.auth.RequestToken;
import com.example.app_peliculas_series.io.web.model.auth.ResponseCreateToken;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ContractPresenter<V extends Contract.ContractInterfaceView> extends BasePresenter<V> implements Contract.ContractInterfacePresenter<V> {
    @Override
    public void getRequestToken(RequestToken request) {
        getView().showProgress();
        Call<ResponseCreateToken> call = apiManager.createService(ApiAuth.class).sendRequestToken(BuildConfig.TOKEN, "application/json");
        call.enqueue(new Callback<ResponseCreateToken>() {
            @Override
            public void onResponse(Call<ResponseCreateToken> call, Response<ResponseCreateToken> response) {
                if (response.isSuccessful()) {
                    if (response.body().getStatusMessage().equals("Success.")) {
                        getView().hideProgress();
                        getView().createRequestToken(response.body());
                    }
                }
            }
            @Override
            public void onFailure(Call<ResponseCreateToken> call, Throwable t) {
                getView().hideProgress();
                getView().showErrorActivity();
            }
        });
    }
}
