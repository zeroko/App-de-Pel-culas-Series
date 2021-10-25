package com.example.app_peliculas_series.base.view;

import androidx.fragment.app.FragmentManager;

import com.example.app_peliculas_series.base.BaseActivity;


public class BaseCleanActivity<V> extends BaseActivity {
    protected FragmentManager mManager;
    protected V mBinding;
}
