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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.CustomViewBinding;
import com.luongthuan.atm.model.User;
import com.luongthuan.atm.viewmodel.BankViewModel;

public class CustonView extends ConstraintLayout {
    public LayoutInflater layoutInflater;
    public MyClick myClick;
    public CustomViewBinding binding;

    public CustonView(Context context) {
        super(context);
//        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);
        binding=DataBindingUtil.setContentView((Activity) context,R.layout.custom_view);
        myClick=new MyClick(context);
        binding.setButton(myClick);
        binding.setViewmodel(new BankViewModel());
    }

    public CustonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);
    }

    public CustonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustonView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);

    }

    public class MyClick {
        Context context;
        public MyClick(Context context) {
            this.context = context;
        }
        public void onButtonClick(User user) {
            Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
        }
    }
}
