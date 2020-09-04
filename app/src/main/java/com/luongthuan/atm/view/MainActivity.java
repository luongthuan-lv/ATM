package com.luongthuan.atm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.ActivityMainBinding;
import com.luongthuan.atm.model.User;
import com.luongthuan.atm.viewmodel.BankViewModel;

import java.lang.ref.PhantomReference;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private CustonView custonView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custonView=new CustonView(this);

    }




}