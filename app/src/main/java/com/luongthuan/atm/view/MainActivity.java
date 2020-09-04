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

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private User user;
    private MyClick myClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //    setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myClick = new MyClick(this);
        render();


//
//
//        edtNumber.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if (charSequence.toString().trim().length() == 0) {
//                    btnTest.setEnabled(false);
//                    btnTest.setBackgroundColor(Color.parseColor("#8d93ab"));
//                    edtNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
//                } else {
//                    btnTest.setEnabled(true);
//                    btnTest.setBackgroundColor(Color.parseColor("#40a8c4"));
//                    edtNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_baseline_account, 0);
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });

    }

    public void render() {
        user = new User("NHẬP SỐ THẺ ATM");
        binding.setUser(user);
        binding.data.setButton(myClick);
        binding.data.setViewmodel(new BankViewModel());
    }

    public class MyClick {
        Context context;

        public MyClick(Context context) {
            this.context = context;
        }

        public void onButtonClick(User user) {
            user.setData("123");
            Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
        }
    }
}