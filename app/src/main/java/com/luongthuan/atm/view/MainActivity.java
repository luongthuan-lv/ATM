package com.luongthuan.atm.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import com.luongthuan.atm.R;

public class MainActivity extends AppCompatActivity {
    public CustomView customView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customView = new CustomView(this);

    }
//    public void openLanguageScreen() {
//        Intent intent = new Intent(MainActivity.this, ChangeLanguageActivity.class);
//        startActivityForResult(intent, Constants.RequestCode.CHANGE_LANGUAGE);
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode) {
//            case Constants.RequestCode.CHANGE_LANGUAGE:
//                if (resultCode == RESULT_OK) {
//                    customView.myClick.updateViewByLanguage();
//                }
//                break;
//        }
//    }
}