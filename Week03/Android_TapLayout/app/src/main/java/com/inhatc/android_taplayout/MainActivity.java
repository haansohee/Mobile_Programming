package com.inhatc.android_taplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost myTabHost = null;
    TabHost.TabSpec myTabSpec;
    Drawable imgIcon = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTabHost = (TabHost)findViewById(R.id.tabhost);
        myTabHost.setup();

        // Add Tab
        myTabSpec = myTabHost.newTabSpec("Artists")
                .setIndicator("Artists")
                .setContent(R.id.tab1);
        myTabHost.addTab(myTabSpec);

        myTabSpec = myTabHost.newTabSpec("Albums")
                .setIndicator("Albums")
                .setContent(R.id.tab2);
        myTabHost.addTab(myTabSpec);

        myTabSpec = myTabHost.newTabSpec("Songs")
                .setIndicator("Songs")
                .setContent(R.id.tab3);
        myTabHost.addTab(myTabSpec);

        myTabHost.setCurrentTab(0);
    }
}