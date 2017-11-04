
package com.example.anwesha.replica;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anwesha on 23-Jun-17.
 */


public class customSwip extends PagerAdapter  {
    ImageButton ImageButton;
    private int [] imageResources ={R.drawable.capture2,R.drawable.capture3,R.drawable.capture4,R.drawable.capture5};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public customSwip(Context c) {
        ctx=c;
    }
    @Override
    public int getCount() {

        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        TextView textView=(TextView) itemView.findViewById(R.id.imageCount);
        imageView.setImageResource(imageResources[position]);
        textView.setText("Image Counter :"+position);
        container.addView(itemView);
        return itemView;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }


    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==object);
    }
}

