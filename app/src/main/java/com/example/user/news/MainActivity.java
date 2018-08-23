package com.example.user.news;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        NavigationView myDrawer =(NavigationView) findViewById(R.id.widget);
        mToggle =new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setUpDrawerContent(myDrawer);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    if(mToggle.onOptionsItemSelected(item)){
        return true;
    }
        return  super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer(MenuItem menuItem){
        Layout appView= null;
        Class viewClass;
        switch (menuItem.getItemId()){
            case R.id.PolNews:
                viewClass = Politics.class;
                break;
            case R.id.BuzNews:
                viewClass= Business.class;
                break;
            case R.id.TechNews:
                viewClass = Technology.class;
                break;
            case R.id.EntNews:
                viewClass= Entertainment.class;
                default:
                    viewClass= Politics.class;
        }
        try{
            appView = (Layout) viewClass.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        mDrawerLayout.closeDrawers();
    }
    private void setUpDrawerContent(NavigationView navigationView){
    navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            selectItemDrawer(item);
            return  true;
        }
    });
    }
}
