# easyPrefs
easily use android preferences(the easy way!)

    //optional: library now on jcenter!
    //to use this library please add this to your project level build gradle like this!
    allprojects {
    repositories {
    ...

    //this is my repo for now..waiting to add my library to jcenter!

    maven {url = "https://dl.bintray.com/xstar97/Xstar97/" }

    ...
    }}
    
    //to use this library please add this to your app level build gradle!
    compile 'com.mcs.easyprefs:easyprefs:1.0'
    
###examples:

    to save time...here are the following things to rememeber:
    
    1. context = Activity.this or getActivity() //yes it can be used in both activities & fragments!
    2. put(name) = the name  you want to associate with my(value)
    3. my(value) = the data you want to save in sharedprefs
    4. defaultPreferences = "app_id_preferences.xml"
    5. customPreferences = "name_you_want.xml"
    6. for custom prefs...change "Prefs" to the name you want the preference file to have
    7. int mode is only for custom prefs:
    
    public static modes you can use throughout easyPrefs!
    
    - MODE_PRIVATE = 0
    - MODE_WORLD_READABLE = 1
    - MODE_WORLD_WRITEABLE = 2
    - MODE_MULTI_PROCESS = 4
    
###Strings!

    //to save a string to default prefs
    putDefaultString(Context context, String putStringName, String myString);
    
    //to get a string from default prefs
    getDefaultString(Context context, String getStringName);//the string "name" you used to define the value you saved.
    
    //to save a string to custom prefs
    putCustomString(Context context, String Prefs, int mode, String putStringName, String myString);
    
    //to get a string from custom prefs
    getCustomString(Context context, String Prefs, int mode, String getStringName);
    
###booleans

    //to save a boolean to default prefs
    putDefaultBoolean(Context context, String putBooleanName, boolean myBoolean);
    
    //to get a boolean from default prefs
    getDefaultBoolean(Context context, String getBooleanName, boolean myBoolean);
    
    //to save a boolean to custom prefs
    putCustomBoolean(Context context, String Prefs, int mode, String putBooleanName, boolean myboolean);
    
    //to get a boolean from custom prefs
    getCustomBoolean(Context context, String Prefs, int mode, String getBooleanName, boolean myBoolean);
    
###StringSet< String > 

    //to save a StringSet<String> to default Prefs
    putDefaultStringSet(Context context, String putStringSetName, Set<String> myStringSet);
    
    //to get a StringSet<String> from default Prefs
    getDefaultStringSet(Context context, String getStringSetName, Set<String> myStringSet);
    
    //to save a StringSet<String> to default Prefs
    putCustomStringSet(Context context, String Prefs, int mode, String putStringSetName, Set<String> myStringSet);
    
    //to get a StringSet<String> from custom Prefs
    getCustomStringSet(Context context, String Prefs, int mode, String getStringSetName, Set<String> myStringSet);
    
    
###int

    //to save a int to default Prefs
    putDefaultInt(Context context, String putIntName, int myInt);
    
    //to get a int from default Prefs
    getDefaultInt(Context context, String getIntName, int myInt);
    
    //to save a int to custom Prefs
    putCustomInt(Context context, String Prefs, int mode, String putIntName, int myInt);
    
    //to get a int from custom Prefs
    getCustomInt(Context context, String Prefs, int mode, String getIntName, int myInt);

###float

    //to save a float to default Prefs
    putDefaultFloat(Context context, String putFloatName, Float myFloat);
    
    //to get a float from default Prefs
    getDefaultFloat(Context context, String getFloatName, Float myFloat);
    
    //to save a float to custom Prefs
    putCustomFloat(Context context, String Prefs, int mode, String putFLoatName, String myFloat);
    
    //to get a float from custom Prefs
    getCustomFloat(Context context, String Prefs, int mode, String getFloatName, int myFloat);

###long

    //to save a long to default Prefs
    putDefaultLong(Context context, String putLongName, int myLong);

    //to get a long from default Prefs
    getDefaultLong(Context context, String getFloatName, Long myFloat);
    
    //to save a long to custom Prefs
    putCustomLong(Context context, String Prefs, int mode, String putLongName, int myLong);
    
    //to get a long from custom Prefs
    getCustomLong(Context context, String Prefs, int mode, String getLongName, Long myLong);

###all

    //to get all from default Prefs
    Map<String,?> getDefaultAll(Context context); 
    
    //to get all from custom Prefs
    Map<String,?> getCustomAll(Context context, String Prefs, int mode);

    clearDefaultAll(Context context);
    
    clearCustomAll(Context context, String Prefs, int mode);

    clearDefaultValue(Context context, String valueName);
    
    clearCustomValue(Context context, String Prefs, int mode, String valueName);
