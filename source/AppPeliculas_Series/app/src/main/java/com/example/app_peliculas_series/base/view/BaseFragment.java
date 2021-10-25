package com.example.app_peliculas_series.base.view;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.app_peliculas_series.utils.PersistanData;


public class BaseFragment<V> extends Fragment {
    protected Context mContext;
    protected FragmentManager mFragmentManager;
    protected V mBinding;
    protected PersistanData mPreferences;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFragmentManager = getFragmentManager();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

}
