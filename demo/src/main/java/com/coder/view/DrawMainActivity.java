package com.coder.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.coder.com.coder.base.activity.BaseActivity;
import com.coder.demo.R;

/**
 * Created by JiKe on 2016/9/18.
 */
public class DrawMainActivity extends BaseActivity implements View.OnClickListener{

    private Button drawArc;
    private Button phoneScreenInfo;
    private Button viewSlide;
    private Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_view_main);

        drawArc = (Button) findViewById(R.id.draw_arc);
        phoneScreenInfo = (Button) findViewById(R.id.phone_screen_info);
        viewSlide = (Button) findViewById(R.id.view_slide);

        drawArc.setOnClickListener(this);
        phoneScreenInfo.setOnClickListener(this);
        viewSlide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.draw_arc:
                intent.setClass(DrawMainActivity.this, DrawArcActivity.class);
                startActivity(intent);
                break;
            case R.id.phone_screen_info:
                intent.setClass(DrawMainActivity.this, PhoneScreenInfo.class);
                startActivity(intent);
                break;
            case R.id.view_slide:
                intent.setClass(DrawMainActivity.this, ViewSlideActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }



}
