package com.val.fragmentrecycler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View v;
    private RecyclerView myRecyclerView;
    private List<Contact> listContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.contact_fragment,container,false);
        myRecyclerView=(RecyclerView)v.findViewById(R.id.contact_recycler);
        RecyclerViewAdapter recyclerAdapter=new RecyclerViewAdapter(getContext(),listContact);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContact= new ArrayList<>();
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a0));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a1));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a2));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a0));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a1));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a2));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a));
        listContact.add(new Contact("val montusclat","06 00 00 00 00",R.drawable.a1));

    }
}
