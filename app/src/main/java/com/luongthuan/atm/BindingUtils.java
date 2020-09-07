package com.luongthuan.atm;

import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

import com.luongthuan.atm.listener.OnTextChangeListener;
import com.luongthuan.atm.view.CustomViewNew;

public class BindingUtils {

    @BindingAdapter("title")
    public static void setTitle(CustomViewNew customViewNew, String title) {
        customViewNew.setTitle(title);
    }

    @BindingAdapter("inputValue")
    public static void setInputValue(CustomViewNew customViewNew, String inputValue) {
        customViewNew.setInputValue(inputValue);
    }

    @InverseBindingAdapter(attribute = "inputValue")
    public static String getInputValue(CustomViewNew customViewNew) {
        return customViewNew.getInputValue();
    }

    @BindingAdapter(value = "inputValueAttrChanged")
    public static void setListeners(CustomViewNew editText, final InverseBindingListener listener) {
        editText.setOnTextChangeListener(new OnTextChangeListener() {
            @Override
            public void onTextChangeListener() {
                listener.onChange();
            }
        });
    }
}
