package com.example.user.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;

public class Politics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> words = new ArrayList<News>();

        words.add(new News("Betsy DeVos draws ire for considering federal funds for school guns",
                "Should federal grant funds be used to buy guns to arm school employees?",
                R.drawable.p1));
        words.add(new News("Scott Morrison, Australia's Next Prime Minister, Pledges to 'Heal Our Party'",
                "Mr. Morrison, who replaced Malcolm Turnbull after days of political intrigue, said the ",
                R.drawable.p2));
        words.add(new News("Missouri AG launches probe into Catholic Church sexual abuse",
                "Missouri Attorney General Josh Hawley announced Thursday an investigation into clergy sex",
                R.drawable.p3));
        words.add(new News("Treasury Issues Crackdown on State and Local Tax Workarounds",
                "A proposed rule aims to foil states that sought to counteract provisions of the new federal law",
                R.drawable.p4));
        words.add(new News("Top CEOs Denounce Trump Immigration Policy as Threat to US Economy",
                "Timothy D. Cook of Apple, Ginni Rometty of IBM and dozens of other C.E.O.s said",
                R.drawable.p5));

        NewsListAdapter adapter = new NewsListAdapter(this, words);
        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(adapter);

        //verify the content of the array
        Log.v("Politics Activity", "word at index 0: " + words.get(0));
    }
}
