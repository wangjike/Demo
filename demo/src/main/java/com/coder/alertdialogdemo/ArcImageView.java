package com.coder.alertdialogdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;

import com.coder.demo.R;

/**
 * Created by JiKe on 2016/9/12.
 */
public class ArcImageView extends ImageView{

    public ArcImageView(Context context) {
        this(context,null);
    }

    public ArcImageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ArcImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * 绘制弧线
     * @author wjk
     */
    @Override
    protected void onDraw(Canvas canvas) {
        DisplayMetrics dm = getContext().getResources().getDisplayMetrics();
        float w_screen = dm.widthPixels;
        int h_screen = dm.heightPixels;
        Log.e("ArcImageView", "屏幕尺寸2：宽度 = " + w_screen + "高度 = " + h_screen + "密度 = " + dm.densityDpi);
        Log.e("ArcImageView", "屏幕尺寸2：宽度 = " + getWidth() + "高度 = " + getHeight() );
        //float hight  = dip2px(getContext(), 120);
        float hight  = dip2px(getContext(), px2dip(getContext(), getHeight()));
        /***配置画笔***/
        Paint paint=new Paint();//采用默认设置创建一个画笔
        paint.setAntiAlias(true);//使用抗锯齿功能
        paint.setColor(getResources().getColor(R.color.mc_redbag_bg_red));    //设置画笔的颜色为红色
        paint.setStyle(Paint.Style.FILL);//设置画笔类型为填充
        /***配置矩形边框**/
        RectF oval1=new RectF(0,0,getWidth(), hight);
        canvas.drawArc(oval1, 0, 180, true, paint);//小弧形

    }

    public int dip2px(Context context, float dipValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale + 0.5f);
    }
    public int px2dip(Context context, float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5f);
    }

}
