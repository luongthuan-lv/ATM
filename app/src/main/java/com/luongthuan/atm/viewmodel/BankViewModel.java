package com.luongthuan.atm.viewmodel;

import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.luongthuan.atm.BR;
import com.luongthuan.atm.model.User;

public class BankViewModel extends BaseObservable {
    @Bindable
    private boolean afterTextChanged = false;

    @Bindable
    private boolean visibility = true;

    private void setAfterTextChanged(boolean afterTextChanged) {
        this.afterTextChanged = afterTextChanged;
        notifyPropertyChanged(BR.afterTextChanged);
    }

    private void setVisibility(boolean visibility){
        this.visibility=visibility;
        notifyPropertyChanged(BR.visibility);
    }

    public boolean getAfterTextChanged() {
        Log.e("1111","00000");
        return afterTextChanged;
    }

    public boolean getVisibility(){
        return visibility;
    }

    public void afterTextChanged(CharSequence charSequence) {
        Log.e("1111","11s1");
        if (charSequence.length() == 0) {
            setAfterTextChanged(false);
            setVisibility(true);
            Log.e("1111","111");
        } else {
            setAfterTextChanged(true);
            setVisibility(false);
            Log.e("1111","2222");

        }
    }

}
