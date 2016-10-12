package com.coder.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.coder.DataModel.Contacts;
import com.coder.adapter.ContactsAdapter;
import com.coder.demo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiKe on 2016/10/10.
 */
public class TopFragment extends Fragment{

    private ListView listView;
    private ContactsAdapter adapter;

    private List<Contacts> topList = new ArrayList<Contacts>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_top_list_view);
        initList();
        adapter = new ContactsAdapter(getActivity(), R.layout.activity_contacts, topList);
        listView.setAdapter(adapter);
        return view;
    }

    private void initList() {
        Contacts contact = new Contacts();
        topList.add(contact);
        topList.add(contact);
    }
}
