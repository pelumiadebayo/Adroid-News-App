package com.example.user.news;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class News {

   private String mNewsHeadline;
    private  String mNewsBody;
    private int mImageResourceId;

    public News(String headline, String body, int image){
        mNewsHeadline =headline;
        mNewsBody= body;
        mImageResourceId= image;
    }

    //get the headline of the news
    public String getHeadline(){
         return  mNewsHeadline;
    }

    //get the body of the news
    public String getBody(){
        return  mNewsBody;
    }

    //get the image of the news
    public int getImage(){
        return  mImageResourceId;
    }
}
