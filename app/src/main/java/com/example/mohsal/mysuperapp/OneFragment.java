package com.example.mohsal.mysuperapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohsal on 8/24/2018.
 */

public class OneFragment extends Fragment {


    List<MenuElements> mainMenu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_one,container,false);
        mainMenu=new ArrayList<>();
        mainMenu.add(new MenuElements("bank",R.drawable.ic_bank));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("bank",R.drawable.ic_bank));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));
        mainMenu.add(new MenuElements("train ticket",R.drawable.ic_train));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),mainMenu);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);
        return view;
    }
}
