package com.example.mohsal.mysuperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuDetail extends AppCompatActivity {

    private String titletxt,indextxt;
    private int pic,index;
    private TextView title_tv,index_tv;
    private ImageView logo_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);
        Intent intent=getIntent();
        titletxt=intent.getExtras().getString("Title");
        pic=intent.getExtras().getInt("logo");
        index=intent.getExtras().getInt("Index");


        title_tv=findViewById(R.id.title_tv);
        logo_iv=findViewById(R.id.logo_iv);
        index_tv=findViewById(R.id.index_tv);

        title_tv.setText(titletxt);
        logo_iv.setImageResource(pic);

        index_tv.setText("Menu item number:"+(index+1));


    }
}
