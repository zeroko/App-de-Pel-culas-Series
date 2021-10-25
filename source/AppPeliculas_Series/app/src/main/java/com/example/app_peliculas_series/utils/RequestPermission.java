package com.example.app_peliculas_series.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class RequestPermission {
    public static final int REQUEST_CODE = 11;
    public static Context mContext;
    public static Activity mActivity;

    public static void validarPermisosApp(Context context, Activity activity) {
        mContext = context;
        mActivity = activity;
        if ((ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                || (ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
        }
    }

    public static void isPermissionGranted(boolean permission) {
        if (!permission) {
            Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            Uri uri = Uri.fromParts("package", mActivity.getPackageName(), null);
            intent.setData(uri);
            mContext.startActivity(intent);
            Toast.makeText(mContext, "Por favor conceda el acceso", Toast.LENGTH_LONG).show();
        }
    }
}
