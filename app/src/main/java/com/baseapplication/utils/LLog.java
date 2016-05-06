package com.baseapplication.utils;

import android.util.Log;

import com.baseapplication.BuildConfig;

public class LLog {
	private static final String TAG = "com.levid";
	private static final String EMPTY_LOG = "";

	enum Level {
		d, w, e
	}

    private static boolean isDebugMode(){
        return BuildConfig.DEBUG;
    }

	private static String getMessage(String s) {
		return (s == null ? EMPTY_LOG : s);
	}

	public static void d(String s) {
		if (isDebugMode()) {
			Log.d(TAG, getMessage(s));
		}
	}

	public static void e(String s) {
		if (isDebugMode()) {
			Log.e(TAG, getMessage(s));
		}
	}

    public static void i(String s) {
        if (isDebugMode()) {
            Log.i(TAG, getMessage(s));
        }
    }

	public static void d(String tag, String message) {
		if (isDebugMode()) {
			Log.d(tag, getMessage(message));
		}
	}

	public static void w(String tag, String message) {
		if (isDebugMode()) {
			Log.w(tag, getMessage(message));
		}
	}

	public static void i(String tag, String message) {
		if (isDebugMode()) {
			Log.i(tag, getMessage(message));
		}
	}

	public static void e(String tag, String message) {
		if (isDebugMode()) {
			Log.e(tag, getMessage(message));
		}
	}
}
