package com.luongthuan.atm.view;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.CustomViewNewBinding;
import com.luongthuan.atm.listener.OnTextChangeListener;

public class CustomViewNew extends RelativeLayout {

    private Context mContext;

    private CustomViewNewBinding mBinding;

    public CustomViewNew(Context context) {
        super(context);
        initUI(context);
    }

    public CustomViewNew(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUI(context);
    }

    public CustomViewNew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initUI(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomViewNew(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initUI(context);
    }

    private void initUI(Context context) {
        mContext = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = CustomViewNewBinding.inflate(inflater, this, true);
    }

    public void setTitle(String title) {
        if (mBinding != null) {
            mBinding.textView.setText(title);
        }
    }

    public void setInputValue(String inputValue) {
        if (mBinding != null) {
            mBinding.edtNumber.setText(inputValue);
        }
    }

    public String getInputValue() {
        if (mBinding != null) {
            return TextUtils.isEmpty(mBinding.edtNumber.getText()) ? "" : mBinding.edtNumber.getText().toString();
        } else {
            return "";
        }
    }

    public void setOnTextChangeListener(final OnTextChangeListener listener) {
        if (mBinding != null) {
            mBinding.edtNumber.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (listener != null) {
                        listener.onTextChangeListener();
                    }
                }
            });
        }
    }
}
