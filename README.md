# SharedStorage
Handle Shared Preference easily.

    
    allprojects {
        repositories {
            jcenter()
            maven { url 'https://jitpack.io' }
            ...
        }
    }
    
    implementation 'com.github.Sourav242:SharedStorage:1.0'
    
    SharedPreferenceStorage.setValue(context, key, value);
    SharedPreferenceStorage.setValue(context, Map<String, <T>>);
    SharedPreferenceStorage.setValue(context, GROUP_TAG, key, value);
    
    SharedPreferenceStorage.getValue(context, key, defaultValue);
    SharedPreferenceStorage.getValue(context, GROUP_TAG, key, defaultValue);
    
    SharedPreferenceStorage.clearSharedPreferences(context);
    SharedPreferenceStorage.clearSharedPreferences(context, GROUP_TAGS[]);
