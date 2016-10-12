package com.coder.alertdialogdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.coder.demo.R;

/**
 * Created by JiKe on 2016/9/12.
 */
public class RedbagDetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mc_activity_single_redbag_detail);
    }
}
