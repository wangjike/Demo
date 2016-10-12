package com.coder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.coder.alertdialogdemo.DialogMainActivity;
import com.coder.com.coder.base.activity.BaseActivity;
import com.coder.demo.R;

/**
 * Created by JiKe on 2016/10/10.
 */
public class FragmentMainActivity extends BaseActivity implements View.OnClickListener{

    private Button staticFragment;
    private Button dynamicFragment;

    private Intent intent = new Intent();

    public static Class<?> aClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        staticFragment = (Button) findViewById(R.id.btn_static_fragment);
        dynamicFragment = (Button) findViewById(R.id.btn_dynamic_fragment);

        staticFragment.setOnClickListener(this);
        dynamicFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_static_fragment:
                intent.setClass(this, StaticFragmentActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_dynamic_fragment:
                Log.e("Class<?>", aClass.getName());
                intent.setClass(this, aClass);
                startActivity(intent);
                break;
        }
    }

}
