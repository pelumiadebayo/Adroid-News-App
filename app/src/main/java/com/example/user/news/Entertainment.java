package com.example.user.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;

public class Entertainment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> words = new ArrayList<News>();

        words.add(new News("2000 party at pre-opening bash of MGM Springfield casino resort ",
                "The MGM Springfield VIP Preview Party glittered on the gaming floor in anticipation of ",
                R.drawable.b5));
        words.add(new News("Body of ex-Playboy model found strangled in Philadelphia home",
                "Authorities in Pennsylvania found the body of a former Playboy playmate dead ",
                R.drawable.e1));
        words.add(new News("No amount of alcohol is good for your overall health, global study says",
                "The overall risk of drinking alcohol outweighs any known benefits, according to",
                R.drawable.e2));

        NewsListAdapter adapter = new NewsListAdapter(this, words);
        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(adapter);

        //verify the content of the array
        Log.v("Entertainment Activity", "word at index 0: " + words.get(0));
    }
}
