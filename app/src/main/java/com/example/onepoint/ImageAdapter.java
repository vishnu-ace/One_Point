package com.example.onepoint;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    public ArrayList<Integer> imageArray;


    public ImageAdapter(List<Integer> imageArray, Context context ) {
        this.context = context;
        this.imageArray= (ArrayList<Integer>) imageArray;
        //this.imageArray = imageArray;
    }

    @Override
    public int getCount() {
        return imageArray.size() ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return imageArray.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        imageView.setLayoutParams(new GridView.LayoutParams(340,350));


        imageView.setImageResource( imageArray.get(position) );



        return imageView;
    }
}

