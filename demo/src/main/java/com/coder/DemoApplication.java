package com.coder;

import android.app.Application;
import android.content.Context;

/**
 * Created by JiKe on 2016/10/12.
 */
public class DemoApplication extends Application{

    private static DemoApplication instance = new DemoApplication();
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = getApplicationContext();
    }

    public static DemoApplication getInstance() {
        return instance;
    }

    public Context getContext(){
        return context;
    }
}
