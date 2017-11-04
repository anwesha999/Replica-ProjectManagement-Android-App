package com.example.anwesha.replica;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by anwesha on 23-Jun-17.
 */

public class byproducts extends AppCompatActivity {
    ViewPager viewPager;
    customSwip customSwip;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        customSwip = new customSwip(this);
        viewPager.setAdapter(customSwip);
    }
}

