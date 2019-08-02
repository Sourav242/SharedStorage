package com.github.Sourav242.sharedstorage;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

/**
 * Created by Sourav242 on 18/06/2018.
 */

public class SharedPreferenceStorage {
    private static final String PREF_NAME = BuildConfig.APPLICATION_ID;
    private static final int MODE = Context.MODE_PRIVATE;

    /**
     * GetSharedPreferences
     * @param context
     * @return
     */

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, MODE);
    }

    /**
     * GetSharedPreferences with Preference Name
     * @param context
     * @param PREF_NAME
     * @return
     */

    private static SharedPreferences getPreferences(Context context, String PREF_NAME) {
        return context.getSharedPreferences(PREF_NAME, MODE);
    }

    /**
     * GetSharedPreferences.Editor
     * @param context
     * @return
     */

    private static SharedPreferences.Editor getEditor(Context context) {
        return getPreferences(context).edit();
    }

    /**
     * GetSharedPreferences.Editor with Preference Name
     * @param context
     * @param PREF_NAME
     * @return
     */

    private static SharedPreferences.Editor getEditor(Context context, String PREF_NAME) {
        return getPreferences(context, PREF_NAME).edit();
    }

    /**
     * GetValues
     * @param context
     * @param key
     * @param defaultValue
     * @return
     */

    public static int getValue(Context context, String key, int defaultValue) {
        return getPreferences(context).getInt(key, defaultValue);
    }

    public static float getValue(Context context, String key, float value) {
        return getPreferences(context).getFloat(key, value);
    }

    public static boolean getValue(Context context, String key, boolean defaultValue) {
        return getPreferences(context).getBoolean(key, defaultValue);
    }

    public static String getValue(Context context, String key, String default_value) {
        return getPreferences(context).getString(key, default_value);
    }

    /**
     * GetValues with Preference Name
     * @param context
     * @param PREF_NAME
     * @param key
     * @param default_value
     * @return
     */

    public static int getValue(Context context, String PREF_NAME, String key, int default_value) {
        return getPreferences(context, PREF_NAME).getInt(key, default_value);
    }

    public static float getValue(Context context, String PREF_NAME, String key, float default_value) {
        return getPreferences(context, PREF_NAME).getFloat(key, default_value);
    }

    public static boolean getValue(Context context, String PREF_NAME, String key, boolean default_value) {
        return getPreferences(context, PREF_NAME).getBoolean(key, default_value);
    }

    public static String getValue(Context context, String PREF_NAME, String key, String default_value) {
        return getPreferences(context, PREF_NAME).getString(key, default_value);
    }

    /**
     * SetValues
     * @param context
     * @param key
     * @param value
     */

    public static void setValue(Context context, String key, int value) {
        getEditor(context).putInt(key, value).commit();
    }

    public static void setValue(Context context, String key, float value) {
        getEditor(context).putFloat(key, value).commit();
    }

    public static void setValue(Context context, String key, boolean value) {
        getEditor(context).putBoolean(key, value).commit();
    }

    public static void setValue(Context context, String key, String value) {
        getEditor(context).putString(key, value).commit();
    }

    /**
     * SetValues with Preference Name
     * @param context
     * @param PREF_NAME
     * @param key
     * @param value
     */

    public static void setValue(Context context, String PREF_NAME, String key, int value) {
        getEditor(context, PREF_NAME).putInt(key, value).commit();
    }

    public static void setValue(Context context, String PREF_NAME, String key, float value) {
        getEditor(context, PREF_NAME).putFloat(key, value).commit();
    }

    public static void setValue(Context context, String PREF_NAME, String key, boolean value) {
        getEditor(context, PREF_NAME).putBoolean(key, value).commit();
    }

    public static void setValue(Context context, String PREF_NAME, String key, String value) {
        getEditor(context, PREF_NAME).putString(key, value).commit();
    }

    public static void setValue(Context context, Map<String, String> map) {
        SharedPreferences.Editor e = getEditor(context);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            e.putString(entry.getKey(), entry.getValue());
        }
        e.commit();
    }

    public static void setValue(Context context, String PREF_NAME, Map<String, String> map) {
        SharedPreferences.Editor e = getEditor(context, PREF_NAME);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            e.putString(entry.getKey(), entry.getValue());
        }
        e.commit();
    }

    /**
     * ClearSharedPreferences
     * @param context
     */

    public static void clearSharedPreferences(Context context) {
        getEditor(context).clear().apply();
    }

    /**
     * clearSharedPreferences
     * @param context
     * @param str send null to delete everything
     */

    public static void clearSharedPreferences(Context context, String[] str) {
        for (String aStr : str) {
            getPreferences(context, aStr).edit().clear().apply();
        }
    }
}
