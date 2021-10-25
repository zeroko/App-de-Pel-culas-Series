package com.example.app_peliculas_series.utils;

import android.os.Build;
import android.util.Base64;
import android.util.Log;

import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {

    public static String getSerialNumber() {
        String serialNumber = null;
        try {
            Log.i("Dispositivo: ", "Manufacturer - "
                    + Build.MANUFACTURER
                    + " Model: " + Build.MODEL
                    + " Android: " + Build.VERSION.RELEASE);
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method get = c.getMethod("get", String.class, String.class);

            serialNumber = (String) get.invoke(c, "sys.serialnumber", "error");
            if (serialNumber.equals("error")) {
                serialNumber = (String) get.invoke(c, "ril.serialnumber", "error");
                serialNumber = Build.MODEL;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serialNumber;
    }

//    public static boolean contains(final int[] arr, final int key) {
//        return ArrayUtils.contains(arr, key);
//    }



    public static String dateFormatter(Date fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.forLanguageTag("es-ES"));
        return formatter.format(fecha);
    }

    public static String timeFormatter(Date fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a", Locale.forLanguageTag("es-ES"));
        return formatter.format(fecha);
    }

    public static String parsearFechaXml(Date fecha) {
        String fecha1 = new SimpleDateFormat("yyyy-MM-dd").format(fecha);
        String hora = new SimpleDateFormat("HH:mm:ss.SSS").format(fecha);
        return fecha1 + "T" + hora;
        // return new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.SSS").format(fecha);
    }
}
