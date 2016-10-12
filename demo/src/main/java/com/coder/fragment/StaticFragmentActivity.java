package com.coder.fragment;

import android.os.Bundle;

import com.coder.com.coder.base.activity.BaseActivity;
import com.coder.demo.R;

/**
 * Created by JiKe on 2016/10/10.
 */
public class StaticFragmentActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_static);
    }
}
