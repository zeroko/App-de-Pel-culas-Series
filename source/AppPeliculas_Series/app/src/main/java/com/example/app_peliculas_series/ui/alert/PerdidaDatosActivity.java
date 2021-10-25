package com.example.app_peliculas_series.ui.alert;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.app_peliculas_series.R;
import com.example.app_peliculas_series.base.view.BaseCleanOutActivity;
import com.example.app_peliculas_series.databinding.ActivityAlertIntentosMaxBinding;
import com.example.app_peliculas_series.resources.Resources;
import com.example.app_peliculas_series.utils.PersistanData;


public class PerdidaDatosActivity extends BaseCleanOutActivity<ActivityAlertIntentosMaxBinding> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityAlertIntentosMaxBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        init();
    }

    private void init() {
        mManager = getSupportFragmentManager();
        mPreferences = new PersistanData(this);
        setupListeners();
    }

    private void setupListeners() {
        setupCloseListener();
        setupContinuarListeners();
    }

    private void setupContinuarListeners() {
        mBinding.txvAqui.setOnClickListener(view -> {
            Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.aprobación_TMDb) + mPreferences.getString(Resources.PreferencesKeys.PreRegister.REQUEST_TOKEN)));
            startActivity(browser);
            mBinding.txvAqui.setVisibility(View.GONE);
        });
    }

    private void setupCloseListener() {
        mBinding.btnClose.setOnClickListener(view -> {
            setResult(RESULT_CANCELED);
            finish();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        mBinding.txvAqui.setVisibility(View.VISIBLE);
    }
}
