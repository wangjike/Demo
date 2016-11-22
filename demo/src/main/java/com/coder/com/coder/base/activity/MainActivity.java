package com.coder.com.coder.base.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.coder.alertdialogdemo.DialogMainActivity;
import com.coder.demo.R;
import com.coder.fragment.DynamicFragmentActivity;
import com.coder.fragment.FragmentMainActivity;
import com.coder.listView.ListViewMainActivity;
import com.coder.view.DrawMainActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener{

    private Button dialog;
    private Button listView;
    private Button view;
    private Button fragment;
    private Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
        localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);

        //WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
        //localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);

        dialog = (Button) findViewById(R.id.btn_dialog);
        listView = (Button) findViewById(R.id.btn_list_view);
        view = (Button) findViewById(R.id.btn_view);
        fragment = (Button) findViewById(R.id.btn_fragment);

        dialog.setOnClickListener(this);
        listView.setOnClickListener(this);
        view.setOnClickListener(this);
        fragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_dialog:
                intent.setClass(this, DialogMainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_list_view:
                intent.setClass(this, ListViewMainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_view:
                intent.setClass(this, DrawMainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_fragment:
                FragmentMainActivity.aClass = DynamicFragmentActivity.class;
                intent.setClass(this, FragmentMainActivity.class);
                startActivity(intent);
                break;
        }
    }

}