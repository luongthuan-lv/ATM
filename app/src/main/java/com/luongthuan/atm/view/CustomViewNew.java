package com.luongthuan.atm.view;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.CustomViewBinding;

public class CustomViewNew extends RelativeLayout {

    private Context mContext;

    private CustomViewBinding mBinding;

    public CustomViewNew(Context context) {
        super(context);
        initUI(context);
    }

    public CustomViewNew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewNew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomViewNew(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void initUI(Context context) {
        mContext = context;
        mBinding = DataBindingUtil.setContentView((Activity) context, R.layout.custom_view);
    }

    public void setTitle(String title) {
        mBinding.textView.setText(title);
    }

    public void setInputValue(String inputValue) {
        mBinding.edtNumber.setText(inputValue);
    }

    public String getInputValue() {
        return TextUtils.isEmpty(mBinding.edtNumber.getText()) ? "" : mBinding.edtNumber.getText().toString();
    }
}
