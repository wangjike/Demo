package com.coder.listView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by JiKe on 2016/9/14.
 */
public class DiffItemAdapter extends BaseAdapter{

    private final int ITEMONE = 1;
    private final int ITEMTWO = 2;

    private List<ItemTwo> list;

    public DiffItemAdapter(List<ItemTwo> list){
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return ITEMONE;
        }else {
            return ITEMTWO;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        int currentType = getItemViewType(i);
        switch (currentType){
            case ITEMONE:
                break;
            case ITEMTWO:
                break;
        }
        return null;
    }

}
