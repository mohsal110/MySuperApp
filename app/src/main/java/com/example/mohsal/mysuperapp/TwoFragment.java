package com.example.mohsal.mysuperapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class TwoFragment extends Fragment {

    EditText cost;
    Button ok;
    EditText phoneNumber;
    Button sendCode;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;

        view= inflater.inflate(R.layout.fragment_two,container,false);




        cost=view.findViewById(R.id.cost);
        ok=view.findViewById(R.id.accept);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }
}
