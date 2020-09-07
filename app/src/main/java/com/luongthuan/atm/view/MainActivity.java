package com.luongthuan.atm.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.ActivityMainBinding;
import com.luongthuan.atm.viewmodel.CustomViewModel;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        CustomViewModel customViewModel = new CustomViewModel(this);
        mainBinding.setViewModel(customViewModel);
    }
}