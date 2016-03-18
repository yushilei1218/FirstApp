package com.yushilei.firstapp.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.yushilei.firstapp.CustomAction;

/**
 * Created by jh on 2016/3/18.
 */
public class MediaReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action) {
            case CustomAction.ACTION_PLAY:
                break;
        }
    }
}
