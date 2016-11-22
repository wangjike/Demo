package com.coder.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.coder.DataModel.Contacts;
import com.coder.adapter.ContactsAdapter;
import com.coder.alertdialogdemo.XCRoundImageView;
import com.coder.demo.R;
import com.coder.view.SlideCutListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiKe on 2016/10/10.
 */
public class BottomFragment extends Fragment implements SlideCutListView.RemoveListener {

    public static String userName;

    private SlideCutListView slideCutListView ;
    private ContactsAdapter adapter;

    private List<Contacts> bottomList = new ArrayList<Contacts>();

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.e("Fragment", userName);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        initList();
        Log.e("Fragment", userName);
        slideCutListView = (SlideCutListView) view.findViewById(R.id.fragment_bottom_list_view);
        adapter = new ContactsAdapter(getActivity(), R.layout.activity_contacts, bottomList);
        slideCutListView.setAdapter(adapter);

        /*slideCutListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                XCRoundImageView imageView = (XCRoundImageView) view.findViewById(R.id.delete);
                imageView.setVisibility(View.VISIBLE);
                final int position = i;
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Contacts item = adapter.getItem(position);
                        adapter.remove(item);
                        slideCutListView.setAdapter(adapter);
                        *//*bottomList.remove(position);
                        adapter.notifyDataSetChanged();*//*
                    }
                });
                return true;
            }
        });*/


        return view;
    }

    private void initList() {
        Contacts contact = new Contacts();
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
        bottomList.add(contact);
    }

    @Override
    public void removeItem(SlideCutListView.RemoveDirection direction, int position) {
        adapter.remove(adapter.getItem(position));
        switch (direction) {
            case RIGHT:
                Toast.makeText(getActivity(), "向右删除  "+ position, Toast.LENGTH_SHORT).show();
                break;
            case LEFT:
                Toast.makeText(getActivity(), "向左删除  "+ position, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
