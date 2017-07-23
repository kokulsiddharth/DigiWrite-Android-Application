package com.mukesh.android.digiwritetesting2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kokul on 22/7/2017.
 */

public class AboutActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
    }
}