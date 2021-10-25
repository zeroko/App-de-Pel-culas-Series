package com.example.app_peliculas_series.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.app_peliculas_series.base.view.BaseCleanOutActivity;
import com.example.app_peliculas_series.databinding.ActivityMainBinding;
import com.example.app_peliculas_series.io.web.model.auth.RequestToken;
import com.example.app_peliculas_series.io.web.model.auth.ResponseCreateToken;
import com.example.app_peliculas_series.resources.Resources;
import com.example.app_peliculas_series.ui.alert.PerdidaDatosActivity;
import com.example.app_peliculas_series.ui.token.Contract;
import com.example.app_peliculas_series.ui.token.ContractPresenter;
import com.example.app_peliculas_series.utils.ConstantesAppPeliculas;
import com.example.app_peliculas_series.utils.PersistanData;

public class Main extends BaseCleanOutActivity<ActivityMainBinding> implements Contract.ContractInterfaceView {
    private ContractPresenter<Main> mainContractPresenter;
    private ProgressDialog mProgress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        init();
    }

    private void init() {
        mPreferences = new PersistanData(this);
        mainContractPresenter = new ContractPresenter<>();
        mainContractPresenter.attach(this);
        mManager = getSupportFragmentManager();
        mProgress = new ProgressDialog(this);
        mProgress.setCancelable(false);
        mProgress.setMessage("Por favor espere");
        setupListeners();
    }

    private void setupListeners() {
        setupContinuarListener();
    }

    private void setupContinuarListener() {
        mBinding.btnToken.setOnClickListener(v -> {
            mBinding.btnToken.setEnabled(false);
            mainContractPresenter.getRequestToken(new RequestToken("http://www.themoviedb.org/"));
        });
    }

    @Override
    public void showProgress() {
        mProgress.show();
    }

    @Override
    public void hideProgress() {
        if (mProgress.isShowing()) {
            mProgress.dismiss();
        }
    }

    @Override
    public void showErrorActivity() {

    }

    @Override
    public void createRequestToken(ResponseCreateToken response) {
        mPreferences.putString(Resources.PreferencesKeys.PreRegister.REQUEST_TOKEN, response.getRequestToken());
        mBinding.btnToken.setEnabled(true);
        startActivityForResult(new Intent(this, PerdidaDatosActivity.class), ConstantesAppPeliculas.APORBAR_TOKEN);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case RESULT_CANCELED:
                if (requestCode == ConstantesAppPeliculas.APORBAR_TOKEN) {

                }
                break;
            case RESULT_OK:
                if (requestCode == ConstantesAppPeliculas.APORBAR_TOKEN) {
                    setResult(RESULT_OK);
                    finish();
                }
                break;
        }
    }
}
