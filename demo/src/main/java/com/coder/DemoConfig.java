package com.coder;

import android.widget.Toast;

/**
 * Created by JiKe on 2016/10/12.
 */
public class DemoConfig {

    private static DemoConfig demoConfig = new DemoConfig();

    private Class<?> toClass;
    private String userName;

    private DemoConfig() {
    }

    public DemoConfig getInstance() {
        return demoConfig;
    }

    public void init(String userName, Class<?> toClass) {
        this.toClass = toClass;
        this.userName = userName;
    }

    public Class<?> getToClass() {
        if(toClass == null){
            Toast.makeText(DemoApplication.getInstance().getContext(),"ToClass is null", Toast.LENGTH_LONG).show();
            return null;
        }
        return toClass;
    }

    public String getUserName() {
        if(userName == null) {
            Toast.makeText(DemoApplication.getInstance().getContext(),"UserName is null", Toast.LENGTH_LONG).show();
            return null;
        }
        return userName;
    }
}
