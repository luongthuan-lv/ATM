package com.luongthuan.atm.viewmodel;

import android.content.Context;

import androidx.databinding.ObservableField;

public class CustomViewModel {

    public ObservableField<String> cardNumber;

    private Context mContext;

    public CustomViewModel(Context context) {
        mContext = context;
        initData();
    }

    private void initData() {
        cardNumber = new ObservableField<>();
        cardNumber.set("123456789");
    }

}
