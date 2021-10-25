package com.example.app_peliculas_series.base.view;

import androidx.fragment.app.FragmentManager;

import com.example.app_peliculas_series.base.BaseActivity;
import com.example.app_peliculas_series.utils.PersistanData;

import java.security.Security;


public class BaseCleanOutActivity<V> extends BaseActivity {
    protected FragmentManager mManager;
    protected V mBinding;
    protected PersistanData mPreferences;
    protected Security mSecurity;
}
