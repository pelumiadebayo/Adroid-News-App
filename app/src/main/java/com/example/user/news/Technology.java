package com.example.user.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;

public class Technology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> words = new ArrayList<News>();

        words.add(new News("Galaxy Note 9 vs. iPhone X",
                "The Galaxy Note 9 and iPhone X represent the best that Samsung and Apple have to offer.",
                R.drawable.t1));
        words.add(new News("Sony Launches PS4 Cloud Remote",
                "Sony teamed up with Performance Designed Products to develop a new remote that can ",
                R.drawable.t2));
        words.add(new News("Google Pixel 3 XL: Review done",
                "Rumours suggest that the Pixel 3 XL will be priced around $750",
                R.drawable.t3));
        words.add(new News("Lamborghini's 770-hp",
                "Lamborghini introduced a more extreme evolution of the Aventador S named SVJ ",
                R.drawable.t4));
        words.add(new News("WoW Expansion Battle For Azeroth Sets",
                "The game's seventh expansion is the fastest-selling expansion",
                R.drawable.t5));
        words.add(new News("Fortnite 5.30 Patch Update:",
                "Fortnite's new patch on PS4, Xbox One, Switch, and PC",
                R.drawable.t6));
        words.add(new News("2019 Ram 1500 eTorque first drive review:",
                "Ram’s new half-ton truck gets a little more efficient with hybrid help.",
                R.drawable.t7));
        words.add(new News("911 restomod celebrates 70 years of Porsche",
                "Porsche isn't done with its celebrations for its 70th anniversary this year.",
                R.drawable.t8));
        words.add(new News("'Xbox All Access' bundles Xbox Live",
                "Microsoft will soon unveil an Xbox All Access subscription plan that will",
                R.drawable.t9));
        words.add(new News("2019 Acura NSX gets more 'playful,'",
                "There wasn't a lot broken with last year's NSX, so don't expect major",
                R.drawable.t10));

        NewsListAdapter adapter = new NewsListAdapter(this, words);
        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(adapter);

        //verify the content of the array
        Log.v("Technology Activity", "word at index 0: " + words.get(0));
    }
}
