package com.coder.view;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.coder.com.coder.base.activity.BaseActivity;
import com.coder.demo.R;

/**
 * Created by JiKe on 2016/9/20.
 */
public class PhoneScreenInfo extends BaseActivity{

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_view_phone_screen_info);

        text = (TextView) findViewById(R.id.show_phone_screen_info);
        setPhoneScreenInfo();
    }

    private void setPhoneScreenInfo() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float xdpi = displayMetrics.xdpi;
        float ydpi = displayMetrics.ydpi;
        float widthPixels = displayMetrics.widthPixels;
        float heightPixels = displayMetrics.heightPixels;
        float density = displayMetrics.density;
        float densityDpi = displayMetrics.densityDpi;
        float scaledDensity = displayMetrics.scaledDensity;

        String info = "xdpi:" + xdpi + "\n"
                + "ydpi:" + ydpi + "\n"
                + "widthPixels:" + widthPixels + "\n"
                + "heightPixels:" + heightPixels + "\n"
                + "density:" + density + "\n"
                + "densityDpi:" + densityDpi + "\n"
                + "scaledDensity:" + scaledDensity + "\n";

        text.setText(info);
    }

}
