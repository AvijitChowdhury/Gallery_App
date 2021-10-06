package com.example.android.gallery_app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imagesAdapter extends BaseAdapter {
    private Context mContext;

    public  int [] imageArray ={
            R.drawable.image,R.drawable.images,R.drawable.images2,R.drawable.me,R.drawable.tiger,R.drawable.image3,R.drawable.images4,R.drawable.images5,R.drawable.images6,R.drawable.images7

    };

    public  imagesAdapter(Context mContext){
        this.mContext=mContext;
    }
    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));

        return imageView;
    }
}
