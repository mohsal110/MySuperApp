package com.example.mohsal.mysuperapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by mohsal on 8/3/2019.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsHolder> {

    private Context context;
    private List<News> NewsList;
    private final ClickListener listener;


    public NewsAdapter(Context context, List<News> NewsList, ClickListener listener) {

        this.context = context;
        this.NewsList = NewsList;
        this.listener = listener;

    }
    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.news_list,null);
        NewsHolder TViewHolder=new NewsHolder(view,listener);

        return TViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {

        News news=NewsList.get(position);
        holder.newsTITLE.setText(news.getNewsTitle());
        holder.newsDES.setText(news.getNewsDescription());



    }

    @Override
    public int getItemCount() {
        return NewsList.size();
    }
    class NewsHolder extends RecyclerView.ViewHolder {


        private WeakReference<ClickListener> listenerRef;

        TextView newsTITLE, newsDES;

        public NewsHolder(View itemView, ClickListener listener) {
            super(itemView);

            listenerRef = new WeakReference<>(listener);
            newsTITLE = (TextView) itemView.findViewById(R.id.newsTitle);
            newsDES = (TextView) itemView.findViewById(R.id.newsDescription);

        }


    }
}
