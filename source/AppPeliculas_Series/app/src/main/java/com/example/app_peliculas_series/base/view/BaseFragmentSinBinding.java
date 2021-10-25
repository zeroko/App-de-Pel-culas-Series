package com.example.app_peliculas_series.base.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.app_peliculas_series.R;
import com.example.app_peliculas_series.utils.Actions;
import com.example.app_peliculas_series.utils.PersistanData;


public class BaseFragmentSinBinding extends Fragment {
    protected Context mContext;
    protected FragmentManager mFragmentManager;
    protected PersistanData mPreferences;
    private ProgressDialog mAlert;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mFragmentManager = getFragmentManager();
    }

    @Override
    public void onAttach(@NonNull Context context) {

        super.onAttach(context);
        mContext = context;
        mPreferences = new PersistanData(context);
    }

    public void removerFragment() {

        getFragmentManager().beginTransaction().remove(this).commit();
    }

    public void mostrarDialogoDeProgreso(@StringRes Integer mensaje) {

        // TODO: ProgressDialog esta deprecated desde API 26, recomiendan usar progress bar.
        if (mAlert == null) {
            mAlert = new ProgressDialog(getContext());
            mAlert.getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary)); //Asigna el color.
            mAlert.setCancelable(false);
        }
        mAlert.setMessage(getResources().getString(mensaje));
        mAlert.show(); //Muestra el alerte
    }

    public void mostrarDialogoDeProgreso(String mensaje) {

        // TODO: ProgressDialog esta deprecated desde API 26, recomiendan usar progress bar.
        if (mAlert == null) {
            mAlert = new ProgressDialog(getContext());
            mAlert.getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary)); //Asigna el color.
            mAlert.setCancelable(false);
        }
        mAlert.setMessage(mensaje);
        mAlert.show(); //Muestra el alerte
    }

    public void ocultarDialogoDeProgreso() {

        if (mAlert != null)
            mAlert.dismiss();
    }

    @Override
    public void onPause() {
        super.onPause();
        Actions.hideKeyboard(getActivity());
    }
}
