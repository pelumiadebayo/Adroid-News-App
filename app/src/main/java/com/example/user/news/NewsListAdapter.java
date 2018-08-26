package com.example.user.news;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsListAdapter extends ArrayAdapter<News> {
    public NewsListAdapter(Activity context, List<News> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listGridView = convertView;
        if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        News currentNews= getItem(position);

        TextView newsHeadline = (TextView) convertView.findViewById(R.id.newsHeadline);
        newsHeadline.setText(currentNews.getHeadline());

        TextView newsBody = (TextView) convertView.findViewById(R.id.newsBody);
        newsBody.setText(currentNews.getBody());

        ImageView newsImg = (ImageView) convertView.findViewById(R.id.newsImg);
        newsImg.setImageResource(currentNews.getImage());
        return listGridView;
    }
}

