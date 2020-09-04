package com.luongthuan.atm.view;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;

import com.luongthuan.atm.R;
import com.luongthuan.atm.model.User;

public class CustonView extends ConstraintLayout {
    LayoutInflater layoutInflater;


    public CustonView(Context context) {
        super(context);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }
    public CustonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        layoutInflater = LayoutInflater.from(context);

    }

    public CustonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        layoutInflater = LayoutInflater.from(context);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustonView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        layoutInflater = LayoutInflater.from(context);

    }



}
