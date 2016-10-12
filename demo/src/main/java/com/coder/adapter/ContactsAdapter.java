package com.coder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.coder.DataModel.Contacts;
import com.coder.alertdialogdemo.XCRoundImageView;
import com.coder.demo.R;

import java.util.List;

/**
 * Created by JiKe on 2016/10/10.
 */
public class ContactsAdapter  extends ArrayAdapter<Contacts> {
    private int resourceId;
    /*XHYJ*/
    public ContactsAdapter(Context context, int textViewResourceId, List<Contacts>
            objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public void remove(Contacts object) {
        super.remove(object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contacts contact = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        } else {
            view = convertView;
        }
        return view;
    }
}
