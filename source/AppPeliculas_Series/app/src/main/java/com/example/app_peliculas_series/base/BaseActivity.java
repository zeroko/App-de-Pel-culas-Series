package com.example.app_peliculas_series.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Esta clase nos servirá como una clase base, desde la cual heredarán nuestras
 * actividades. Contiene los metodos comunes a implementar.
 */

public class BaseActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
//        getRepository();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
//        RequestPermission.validarPermisosApp(this, this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
    }

//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        if (requestCode == 11) {
//            if (grantResults.length > 0) {
//                for (int i : grantResults) {
//                    if (i == PackageManager.PERMISSION_GRANTED) {
//                        RequestPermission.isPermissionGranted(true);
//                    } else {
//                        RequestPermission.isPermissionGranted(false);
//                        break;
//                    }
//                }
//
//            }
//        }
//    }
}