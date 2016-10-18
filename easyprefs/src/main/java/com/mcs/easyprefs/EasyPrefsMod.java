package com.mcs.easyprefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EasyPrefsMod {

    //modes
    public static final int MODE_PRIVATE = 0;
    public static final int MODE_WORLD_READABLE = 1;
    public static final int MODE_WORLD_WRITEABLE = 2;
    public static final int MODE_MULTI_PROCESS = 4;

    //SharedPrefs
    private static SharedPreferences DefaultPrefs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
    private static SharedPreferences CustomPrefs(Context context, String Prefs, int mode) {
        return context.getApplicationContext().getSharedPreferences(Prefs, mode); // 0 - for private mode
    }

    //SharedPreferences.Editor
    private static SharedPreferences.Editor defaultE(Context context){
        SharedPreferences defaultPrefs = DefaultPrefs(context);
        return defaultPrefs.edit();
    }
    private static SharedPreferences.Editor customE(Context context, String Prefs, int mode){
        SharedPreferences customPrefs = CustomPrefs(context, Prefs, mode);
        return customPrefs.edit();
    }

    //get stuff!
    //Strings
    public static String getDefaultString(Context context, String getString) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getString(getString, "");
    }
    public static String getCustomString(Context context, String Prefs, int mode, String getString) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getString(getString, "");
    }

    //booleans
    public static boolean getDefaultBoolean(Context context, String getBoolean, boolean myBoolean) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getBoolean(getBoolean, myBoolean);
    }
    public static boolean getCustomBoolean(Context context, String Prefs, int mode, String getBoolean, boolean myBoolean) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getBoolean(getBoolean, myBoolean);
    }

    //StringSet<String>
    public static Set<String> getDefaultStringSet(Context context, String getStringSet, Set<String> myStringSet) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getStringSet(getStringSet, myStringSet);
    }

    public static Set<String> getCustomStringSet(Context context, String Prefs, int mode, String getStringSet, Set<String> myStringSet) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getStringSet(getStringSet, myStringSet);
    }

    //int
    public static int getDefaultInt(Context context, String getInt, int myInt) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getInt(getInt, myInt);
    }
    public static int getCustomInt(Context context, String Prefs, int mode, String getInt, int myInt) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getInt(getInt, myInt);
    }

    //float
    @NonNull
    public static Float getDefaultFloat(Context context, String getFloat, Float myFloat) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getFloat(getFloat, myFloat);
    }
    @NonNull
    public static Float getCustomFloat(Context context, String Prefs, int mode, String getFloat, int myFloat) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getFloat(getFloat, myFloat);
    }

    //long
    @NonNull
    public static Long getDefaultLong(Context context, String getFloat, Long myFloat) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getLong(getFloat, myFloat);
    }
    @NonNull
    public static Long getCustomLong(Context context, String Prefs, int mode, String getLong, Long myLong) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getLong(getLong, myLong);
    }

    //all
    @NonNull
    public static Map<String,?> getDefaultAll(Context context) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getAll();
    }
    @NonNull
    public static Map<String,?> getCustomAll(Context context, String Prefs, int mode) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getAll();
    }


    //put stuff
    //string
    public static void putDefaultString(Context context, String putString, String myString) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putString(putString, myString);
        default0.apply();
    }
    public static void putCustomString(Context context, String Prefs, int mode, String putString, String myString) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putString(putString, myString);
        custom1.apply();
    }

    public static void putDefaultBoolean(Context context, String putBoolean, boolean bool) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putBoolean(putBoolean, bool);
        default0.apply();
    }
    public static void putCustomBoolean(Context context, String Prefs, int mode, String putBoolean, boolean bool) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putBoolean(putBoolean, bool);
        custom1.apply();
    }

    //StringSet<String>
    public static void putDefaultStringSet(Context context, String putStringSet, Set<String> myStringSet) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putStringSet(putStringSet, myStringSet);
        default0.apply();
    }
    public static void putCustomStringSet(Context context, String Prefs, int mode, String putStringSet, Set<String> myStringSet) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putStringSet(putStringSet, myStringSet);
        custom1.apply();
    }

    //int
    public static void putDefaultInt(Context context, String putInt, int myInt) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putInt(putInt, myInt);
        default0.apply();
    }
    public static void putCustomInt(Context context, String Prefs, int mode, String putInt, int myInt) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putInt(putInt, myInt);
        custom1.apply();
    }

    //float
    public static void putDefaultFloat(Context context, String putFloat, Float myFloat) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putFloat(putFloat, myFloat);
        default0.apply();
    }
    public static void putCustomFloat(Context context, String Prefs, int mode, String putFLoat, String myFloat) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putString(putFLoat, myFloat);
        custom1.apply();
    }

    //long
    public static void putDefaultLong(Context context, String putLong, int myLong) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putLong(putLong, myLong);
        default0.apply();
    }
    public static void putCustomLong(Context context, String Prefs, int mode, String putLong, int myLong) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putLong(putLong, myLong);
        custom1.apply();
    }

    public static void clearDefaultAll(Context context){
        SharedPreferences.Editor default0 = defaultE(context);
        default0.clear();
        default0.apply();
    }
    public static void clearCustomAll(Context context, String Prefs, int mode){
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.clear();
        custom1.apply();
    }

    public static void clearDefaultValue(Context context, String myKey){
        SharedPreferences.Editor default0 = defaultE(context);
        default0.remove(myKey);
        default0.apply();
    }
    public static void clearCustomValue(Context context, String Prefs, int mode, String myKey){
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.remove(myKey);
        custom1.apply();
    }

}