package com.luongthuan.atm.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.luongthuan.atm.BR;

public class User extends BaseObservable {
    String title;
    String hint;

    @Bindable
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyPropertyChanged(BR.data);
    }

    String data;

    public User(String hint) {
        this.hint = hint;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        notifyPropertyChanged(BR.hint);
    }
}
