package com.coder.alertdialogdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.coder.demo.R;

import java.util.ArrayList;
import java.util.List;


public class DialogMainActivity extends Activity implements View.OnClickListener{

    private Button simpleDiaog;
    private Button simpleListDiaog;
    private Button singleChoiceDiaog;
    private Button multiChoiceDiaog;
    private Button customAdateprDiaog;
    private Button customViewDiaog;
    private Button customNoTitleDialog;

    private AlertDialog.Builder builder;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_main);

        simpleDiaog= (Button) findViewById(R.id.btn_simple_dialog);
        simpleListDiaog= (Button) findViewById(R.id.btn_simple_list_dialog);
        singleChoiceDiaog= (Button) findViewById(R.id.btn_single_choice_dialog);
        multiChoiceDiaog= (Button) findViewById(R.id.btn_multi_choice_dialog);
        customAdateprDiaog= (Button) findViewById(R.id.btn_custom_adapter_dialog);
        customViewDiaog= (Button) findViewById(R.id.btn_custom_view_dialog);
        customNoTitleDialog = (Button) findViewById(R.id.btn_custom_not_title_view_dialog);

        simpleDiaog.setOnClickListener(this);
        simpleListDiaog.setOnClickListener(this);
        singleChoiceDiaog.setOnClickListener(this);
        multiChoiceDiaog.setOnClickListener(this);
        customAdateprDiaog.setOnClickListener(this);
        customViewDiaog.setOnClickListener(this);
        customNoTitleDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_simple_dialog:
                showSimpleDialog(view);
                break;
            case R.id.btn_simple_list_dialog:
                showSimpleListDialog(view);
                break;
            case R.id.btn_single_choice_dialog:
                showSingleChoiceDialog(view);
                break;
            case R.id.btn_multi_choice_dialog:
                showMultiChoiceDialog(view);
                break;
            case R.id.btn_custom_adapter_dialog:
                showCustomAdapterDialog(view);
                break;
            case R.id.btn_custom_view_dialog:
                // showCustomViewDialog(view);
                break;
            case R.id.btn_custom_not_title_view_dialog:
                showCustomNoTitleDialog(view);
                break;
        }

    }

    private void showCustomNoTitleDialog(View view){
        Intent intent = new Intent();
        intent.setClass(DialogMainActivity.this, NoTitleActivity.class);
        this.startActivity(intent);
    }

    private void showSimpleDialog(View view) {
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.simple_dialog);
        builder.setMessage(R.string.dialog_message);

        builder.setPositiveButton(R.string.postive_button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), R.string.toast_postive,Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(R.string.negative_button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), R.string.toast_negative, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }


    private void showSimpleListDialog(View view) {
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.simple_list_dialog);

        final String[] Items={"Items_one","Items_two","Items_three"};
        builder.setItems(Items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "You clicked "+Items[i], Toast.LENGTH_SHORT).show();
            }
        });
        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }

    private void showSingleChoiceDialog(View view) {
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.single_choice_dialog);

        final String[] items={"Items_one","Items_two","Items_three"};
        builder.setSingleChoiceItems(items, 1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "You clicked "+items[i], Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }
    private void showMultiChoiceDialog(View view) {
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.simple_list_dialog);

        final String[] items={"Items_one","Items_two","Items_three"};
        builder.setMultiChoiceItems(items, new boolean[]{true, false, true}, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                Toast.makeText(getApplicationContext(),"You clicked "+items[i]+" "+b,Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();

    }
    private void showCustomAdapterDialog(View view){

        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.custom_adapter_dialog);

        List<ItemBean> items=new ArrayList<ItemBean>();
        items.add(new ItemBean(R.drawable.ic_launcher,"You can call me xiaoming"));
        items.add(new ItemBean(R.drawable.ic_launcher, "I'm android xiao"));
        CustomAdapter adapter=new CustomAdapter(items,getApplicationContext());
        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"You clicked"+i,Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();

    }

    private void showCustomViewDialog(View view){
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.custom_view_dialog);

        RelativeLayout loginDialog= (RelativeLayout) getLayoutInflater().inflate(R.layout.custom_view,null);
        builder.setView(loginDialog);

        builder.setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private class CustomAdapter extends BaseAdapter {

        private List<ItemBean> items;
        private LayoutInflater inflater;
        private ImageView image;
        private TextView text;

        public CustomAdapter(List<ItemBean> items, Context context) {
            this.items = items;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view==null){
                view=inflater.inflate(R.layout.custom_adapter,null);
                image= (ImageView) view.findViewById(R.id.id_image);
                text= (TextView) view.findViewById(R.id.id_text);
            }
            image.setImageResource(items.get(i).getImageId());
            text.setText(items.get(i).getMessage());
            return view;
        }
    }


    private class ItemBean{
        private int imageId;
        private String message;

        public ItemBean(int imageId, String message) {
            this.imageId = imageId;
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public int getImageId() {
            return imageId;
        }

        public void setImageId(int imageId) {
            this.imageId = imageId;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


   
}
