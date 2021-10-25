package com.example.app_peliculas_series.resources;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class Alertas {
    public static void crearAlerta(Context context, String mensaje)
    {
        if (context != null)
        {
            AlertDialog.Builder b = new AlertDialog.Builder(context);
            b.setCancelable(false);
            b.setMessage(mensaje);

            b.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });

            try {
                b.create().show();
            }catch (Exception e){
                // Log.e("ERROR", e.toString());
            }
        }
    }

    public static void crearAlertaFinishActivity(Activity activity, Context context, String mensaje) {
        AlertDialog.Builder b = new AlertDialog.Builder(context);
        b.setMessage(mensaje);
        b.setCancelable(false);

        b.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                activity.finish();
            }
        });
        b.create().show();


    }
}
