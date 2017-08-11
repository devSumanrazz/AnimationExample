package com.example.root.animationexample;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by root on 8/11/17.
 */

public class StatusBar  {
    public static void statusBarColorChange(Activity activity,int color){
        Window window =activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(activity.getResources().getColor(color));
    }
}
