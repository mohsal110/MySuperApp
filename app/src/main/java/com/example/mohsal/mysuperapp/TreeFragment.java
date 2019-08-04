package com.example.mohsal.mysuperapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohsal on 8/24/2018.
 */

public class TreeFragment extends Fragment {


    RecyclerView recyclerView;
    List<News> NList;
    NewsAdapter adapter;
    int counter=5;

    private ArrayList<String> news_title=new ArrayList<String>() {

    };
    private ArrayList<String> new_description=new ArrayList<String>() {

    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_three,container,false);


        NList = new ArrayList<>();
        for(int i=0;i<counter;++i) {

            ///////fill these strings with network information
            news_title.add("vvv");
            new_description.add("PPPPPPPpppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");

            ////////////////////////////////////////////



            recyclerView = (RecyclerView) view.findViewById(R.id.t_recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            NList.add(new News(news_title.get(i), new_description.get(i)));

            adapter = new NewsAdapter(getContext(), NList, new ClickListener() {
                @Override
                public void onPositionClicked(int position) {

                }

                @Override
                public void onLongClicked(int position) {

                }
            });
            recyclerView.setAdapter(adapter);




        }

        return view;
    }
}
