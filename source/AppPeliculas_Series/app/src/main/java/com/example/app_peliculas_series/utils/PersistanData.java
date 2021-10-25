package com.example.app_peliculas_series.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.app_peliculas_series.R;


public class PersistanData {
    private final SharedPreferences prefs;

    public PersistanData(Context context) {

        prefs = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
    }

    public String getString(String key) {

        return prefs.getString(key, "");
    }

    public int getInt(String key) {

        return prefs.getInt(key, 0);
    }

    public long getLong(String key) {

        return prefs.getLong(key, 0);
    }

    public boolean getBoolean(String key) {

        return prefs.getBoolean(key, false);
    }

    public void putString(String key, String value) {

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public void putBoolean(String key, boolean value) {

        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public void putInt(String key, int value) {

        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public void putLong(String key, long value) {

        SharedPreferences.Editor editor = prefs.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public void remove(String key) {

        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key);
        editor.apply();
    }

    public void removeAll() {

        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.apply();
    }

}
