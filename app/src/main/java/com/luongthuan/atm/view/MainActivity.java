package com.luongthuan.atm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.luongthuan.atm.R;
import com.luongthuan.atm.databinding.ActivityMainBinding;
import com.luongthuan.atm.model.User;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber;
    Button btnTest;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        User user = new User();
        user.setHint("NHẬP SỐ THẺ ATM");
        user.setTitle("Số thẻ ATM người nhận");

        binding.setUser(user);

        edtNumber = findViewById(R.id.edtNumber);
        btnTest = findViewById(R.id.btnTest);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });


        edtNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().trim().length() == 0) {
                    btnTest.setEnabled(false);
                    btnTest.setBackgroundColor(Color.parseColor("#8d93ab"));
                    edtNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    btnTest.setEnabled(true);
                    btnTest.setBackgroundColor(Color.parseColor("#40a8c4"));
                    edtNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_baseline_account, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}