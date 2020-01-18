package com.example.swipeviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private DemoFragmentCollectionAdpter adapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.pager);
        adapter = new DemoFragmentCollectionAdpter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
