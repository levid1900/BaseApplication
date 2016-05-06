package com.baseapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.baseapplication.base.BaseApplication;


/**
 * Created by levid on 16/4/13.
 */
public class LPreferences {

    private SharedPreferences mPref;
    private SharedPreferences.Editor mEditor;

    private static LPreferences instance = null;

    private LPreferences(Context context) {
        mPref = context.getSharedPreferences("l_config", 0);
        mEditor = mPref.edit();
    }

    public static synchronized LPreferences getInstance() {
        if (instance == null) {
            instance = new LPreferences(BaseApplication.getAppContext());
        }
        return instance;
    }

    public String getDataClearPackageName(){
        return mPref.getString("data_clear_package", "com.sdu.didi.gui");
    }

    public void setDataClearPackageName(String name){
        mEditor.putString("data_clear_package", name);
        mEditor.commit();
    }
}
