package com.coder.fragment;

import android.os.Bundle;

import com.coder.com.coder.base.activity.BaseActivity;
import com.coder.demo.R;

/**
 * Created by JiKe on 2016/10/10.
 */
public class DynamicFragmentActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BottomFragment.userName = "wangjike";
        setContentView(R.layout.fragment_dynamic);
        BottomFragment.userName = "jike";
    }

}
