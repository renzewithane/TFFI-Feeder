package com.example.tffifeeder;

import android.os.Bundle;

import com.example.tffifeeder.databinding.ActivityAboutBinding;

public class About extends DrawerNav {

    ActivityAboutBinding activityAboutBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAboutBinding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(activityAboutBinding.getRoot());

        allocateActivityTitle("About");
    }
}