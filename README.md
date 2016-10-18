# easyPrefs
easily use android preferences(the easy way!)

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

    putDefaultString(context, putString, myString);
    context = MainActivity.this or getActivity()
    putString = is the "ID" you want to use
    myString = is the string data your are saving...
