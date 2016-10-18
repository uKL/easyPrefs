# easyPrefs
easily use android preferences(the easy way!)

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
    to save my & your time here are the following things to rememeber
    context = Activity.this or getActivity() //yes it can be used in both activities & fragments!
    put(BlanK) = the id you want to associate with my(Blank)
    my(Blank) = the data you want to save in sharedprefs
    
    //to save a string to default prefs(basicaly: app_id_preferences.xml)
    putDefaultString(context, putString, myString);
    
    getDefaultString(context, getString);//the string "id" you used
    
