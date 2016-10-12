package com.coder.listView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.coder.com.coder.base.activity.BaseActivity;
import com.coder.demo.R;

import java.util.List;

/**
 * Created by JiKe on 2016/9/14.
 */
public class ListViewMainActivity extends BaseActivity {

    private Button diffButton;
    private List<ItemTwo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_listview_main);

        diffButton = (Button) findViewById(R.id.btn_list_add_diff_item);
        initList();
    }

    private void initList() {
        ItemTwo item1 = new ItemTwo(1);
        ItemTwo item2 = new ItemTwo(2);
        ItemTwo item3 = new ItemTwo(3);
        ItemTwo item4 = new ItemTwo(4);

        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
    }

}
