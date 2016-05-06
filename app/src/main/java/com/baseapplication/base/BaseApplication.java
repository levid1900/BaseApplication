package com.baseapplication.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by levid on 16/4/13.
 */
public class BaseApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
    }

    public static Context getAppContext(){
        return mContext;
    }
}
