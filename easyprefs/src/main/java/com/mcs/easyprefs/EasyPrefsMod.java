package com.mcs.easyprefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;

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
    public static String getDefaultString(Context context, String getStringName) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getString(getStringName, "");
    }
    public static String getCustomString(Context context, String Prefs, int mode, String getStringName) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getString(getStringName, "");
    }

    //booleans
    public static boolean getDefaultBoolean(Context context, String getBooleanName, boolean myBoolean) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getBoolean(getBooleanName, myBoolean);
    }
    public static boolean getCustomBoolean(Context context, String Prefs, int mode, String getBooleanName, boolean myBoolean) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getBoolean(getBooleanName, myBoolean);
    }

    //StringSet<String>
    public static Set<String> getDefaultStringSet(Context context, String getStringSetName, Set<String> myStringSet) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getStringSet(getStringSetName, myStringSet);
    }

    public static Set<String> getCustomStringSet(Context context, String Prefs, int mode, String getStringSetName, Set<String> myStringSet) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getStringSet(getStringSetName, myStringSet);
    }

    //int
    public static int getDefaultInt(Context context, String getIntName, int myInt) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getInt(getIntName, myInt);
    }
    public static int getCustomInt(Context context, String Prefs, int mode, String getIntName, int myInt) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getInt(getIntName, myInt);
    }

    //float
    @NonNull
    public static Float getDefaultFloat(Context context, String getFloatName, Float myFloat) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getFloat(getFloatName, myFloat);
    }
    @NonNull
    public static Float getCustomFloat(Context context, String Prefs, int mode, String getFloatName, int myFloat) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getFloat(getFloatName, myFloat);
    }

    //long
    @NonNull
    public static Long getDefaultLong(Context context, String getFloatName, Long myFloat) {
        SharedPreferences getPrefs = DefaultPrefs(context);
        return getPrefs.getLong(getFloatName, myFloat);
    }
    @NonNull
    public static Long getCustomLong(Context context, String Prefs, int mode, String getLongName, Long myLong) {
        SharedPreferences getPrefs = CustomPrefs(context, Prefs, mode);
        return getPrefs.getLong(getLongName, myLong);
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
    public static void putDefaultString(Context context, String putStringName, String myString) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putString(putStringName, myString);
        default0.apply();
    }
    public static void putCustomString(Context context, String Prefs, int mode, String putStringName, String myString) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putString(putStringName, myString);
        custom1.apply();
    }

    public static void putDefaultBoolean(Context context, String putBooleanName, boolean myBoolean) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putBoolean(putBooleanName, myBoolean);
        default0.apply();
    }
    public static void putCustomBoolean(Context context, String Prefs, int mode, String putBooleanName, boolean myBoolean) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putBoolean(putBooleanName, myBoolean);
        custom1.apply();
    }

    //StringSet<String>
    public static void putDefaultStringSet(Context context, String putStringSetName, Set<String> myStringSet) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putStringSet(putStringSetName, myStringSet);
        default0.apply();
    }
    public static void putCustomStringSet(Context context, String Prefs, int mode, String putStringSetName, Set<String> myStringSet) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putStringSet(putStringSetName, myStringSet);
        custom1.apply();
    }

    //int
    public static void putDefaultInt(Context context, String putIntName, int myInt) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putInt(putIntName, myInt);
        default0.apply();
    }
    public static void putCustomInt(Context context, String Prefs, int mode, String putIntName, int myInt) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putInt(putIntName, myInt);
        custom1.apply();
    }

    //float
    public static void putDefaultFloat(Context context, String putFloatName, Float myFloat) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putFloat(putFloatName, myFloat);
        default0.apply();
    }
    public static void putCustomFloat(Context context, String Prefs, int mode, String putFLoatName, String myFloat) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putString(putFLoatName, myFloat);
        custom1.apply();
    }

    //long
    public static void putDefaultLong(Context context, String putLongName, int myLong) {
        SharedPreferences.Editor default0 = defaultE(context);
        default0.putLong(putLongName, myLong);
        default0.apply();
    }
    public static void putCustomLong(Context context, String Prefs, int mode, String putLongName, int myLong) {
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.putLong(putLongName, myLong);
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

    public static void clearDefaultValue(Context context, String valueName){
        SharedPreferences.Editor default0 = defaultE(context);
        default0.remove(valueName);
        default0.apply();
    }
    public static void clearCustomValue(Context context, String Prefs, int mode, String valueName){
        SharedPreferences.Editor custom1 = customE(context, Prefs, mode);
        custom1.remove(valueName);
        custom1.apply();
    }

}