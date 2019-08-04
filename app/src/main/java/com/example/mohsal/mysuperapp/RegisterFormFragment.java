package com.example.mohsal.mysuperapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mohsal on 8/3/2019.
 */

public class RegisterFormFragment extends Fragment {

    EditText phoneNumber;
    Button sendCode;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.register_form_fragment,container,false);
        sendCode=view.findViewById(R.id.sendCode);
        phoneNumber=view.findViewById(R.id.phonenumber);

        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(getContext(),CodeVerify.class);
                startActivity(intent);

            }
        });

        return view;
    }



}
