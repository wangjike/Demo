package com.coder.alertdialogdemo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.coder.demo.R;

/**
 * created by jike on 2016/9/8.
 */
public class NoTitleActivity extends Activity implements View.OnClickListener{

    private TextView show_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        /*try{
            WindowManager.LayoutParams lp = this.getWindow().getAttributes();
            lp.gravity = Gravity.CENTER;
            lp.dimAmount = 0;
            lp.flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                    | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;

            lp.width = WindowManager.LayoutParams.MATCH_PARENT;
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

            LayoutInflater inflater = getLayoutInflater();
            RelativeLayout ll = (RelativeLayout) inflater.inflate( R.layout.mc_activity_open_redbag, null);
            setContentView(ll, lp);
        } catch (Exception e){
            e.printStackTrace();
        }*/


        setContentView(R.layout.mc_activity_open_redbag);
        getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        DisplayMetrics  dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        //Toast.makeText(NoTitleActivity.this, dm.widthPixels, Toast.LENGTH_SHORT).show();
        //int screenWidth = dm.widthPixels;
        //int screenHeight = dm.heightPixels;

        /*WindowManager.LayoutParams lp = this.getWindow().getAttributes();
        lp.gravity = Gravity.TOP | Gravity.LEFT;
        lp.dimAmount = 0;
        lp.flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;

        LayoutInflater inflater = getLayoutInflater();
        LinearLayout ll = (LinearLayout) inflater.inflate(
                R.layout.custom_no_title_view, null);
        setContentView(ll, lp);*/
        init();
    }

    private void init() {
        show_detail = (TextView) findViewById(R.id.show_detail);

        show_detail.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.show_detail:
                showDetail();
                break;
        }
    }

    private void showDetail() {
        Toast.makeText(NoTitleActivity.this, "ShowDetail", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(NoTitleActivity.this, RedbagDetailActivity.class);
        startActivity(intent);
    }

}
