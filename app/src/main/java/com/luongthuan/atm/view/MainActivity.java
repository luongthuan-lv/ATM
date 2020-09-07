package com.luongthuan.atm.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.ActivityMainBinding;
import com.luongthuan.atm.viewmodel.CustomViewModel;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomViewModel customViewModel = new CustomViewModel(this);
        mainBinding.setViewModel(customViewModel);
    }
}