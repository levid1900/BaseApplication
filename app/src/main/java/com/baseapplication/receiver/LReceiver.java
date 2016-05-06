package com.baseapplication.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LReceiver extends BroadcastReceiver {
    public LReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if("com.levid.settings.didi".equals(intent.getAction())){

        }
    }
}
