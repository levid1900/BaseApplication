package com.baseapplication.utils;

import com.baseapplication.BuildConfig;
import com.orhanobut.logger.AndroidLogTool;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.Settings;

public class LLog {
    private static final String TAG = "com.levid";
    private static final String EMPTY_LOG = "";

    private static LLog mInstance;

    public static LLog getInstance() {
        if (mInstance == null) {
            mInstance = new LLog();
        }
        return mInstance;
    }

    private LLog() {
        Logger.init(TAG)
                .methodCount(0)                 // default 2
                .hideThreadInfo()               // default shown
                .logLevel(LogLevel.FULL)        // default LogLevel.FULL
                .methodOffset(0)                // default 0
                .logTool(new AndroidLogTool()); // custom log tool, optional
    }

    private boolean isDebugMode() {
        return BuildConfig.DEBUG;
    }

    private String getMessage(String s) {
        return (s == null ? EMPTY_LOG : s);
    }

    public void json(String json) {
        if (isDebugMode()) {
            Logger.json(getMessage(json));
        }
    }

    public void d(String s) {
        if (isDebugMode()) {
            Logger.d(getMessage(s));
        }
    }

    public void e(String s) {
        if (isDebugMode()) {
            Logger.e(getMessage(s));
        }
    }

    public void i(String s) {
        if (isDebugMode()) {
            Logger.i(getMessage(s));
        }
    }

    public void d(String tag, String message) {
        if (isDebugMode()) {
            Logger.t(tag).d(getMessage(message));
        }
    }

    public void w(String tag, String message) {
        if (isDebugMode()) {
            Logger.t(tag).w(getMessage(message));
        }
    }

    public void i(String tag, String message) {
        if (isDebugMode()) {
            Logger.t(tag).i(getMessage(message));
        }
    }

    public void e(String tag, String message) {
        if (isDebugMode()) {
            Logger.t(tag).e(getMessage(message));
        }
    }
}
