package com.example.user.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class Business extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> words = new ArrayList<News>();

        words.add(new News("How Two Musk Decisions in 2016 Put Tesla Into Trouble",
                "At the start of 2016, the stock market was tumbling. Shares of Tesla were down",
                R.drawable.b1));
        words.add(new News("One Chinese factory says it's fighting to 'survive'",
                " the owner of a Chinese factory, told CNBC that President Donald Trump's tariffs will affect more than",
                R.drawable.b2));
        words.add(new News("Hackers help themselves to data belonging to 2 million T-Mobile customers",
                "The \"international\" threat actors managed to capture a set of customer data before being shut down.",
                R.drawable.b3));
        words.add(new News("A dozen of tech's biggest companies to reportedly meet about election preparations",
                "The summit will discuss strategies for avoiding another round of ",
                R.drawable.b4));
        words.add(new News("Small fire breaks out at Tesla factory in Fremont",
                "A small fire broke out late Thursday at Tesla Inc.’s auto factory in Fremont, Calif.",
                R.drawable.b6));
        words.add(new News("Starbucks employees will be paid for community service in newly launched program",
                "This gives a new meaning to “out of the office.”",
                R.drawable.b7));
        words.add(new News("Facebook poaches new CMO Antonio Lucio from HP",
                "Amidst Facebook’s biggest branding crisis, it’s just hired a veteran CMO formerly of Pepsi and Visa",
                R.drawable.b9));
        words.add(new News("Sony is relaunching its Aibo robot dog",
                "Sony's reintroducing the Aibo dog to the US market as part of an effort to revitalize its brand.",
                R.drawable.b10));

        NewsListAdapter adapter = new NewsListAdapter(this, words);
        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(adapter);

        //verify the content of the array
        Log.v("Business Activity", "word at index 0: " + words.get(0));
    }
}
