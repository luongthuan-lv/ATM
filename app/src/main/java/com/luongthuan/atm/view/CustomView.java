package com.luongthuan.atm.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
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
import com.luongthuan.atm.viewmodel.LocaleHelper;

import java.util.ArrayList;
import java.util.List;

public class CustomView extends ConstraintLayout {
    public LayoutInflater layoutInflater;
    public MyClick myClick;
    public CustomViewBinding binding;
    boolean lang_selected;
    Resources resources;
    String data;

    public CustomView(final Context context) {
        super(context);
//        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);

        binding = DataBindingUtil.setContentView((Activity) context, R.layout.custom_view);
        myClick = new MyClick(context);
        binding.setButton(myClick);
        binding.setViewmodel(new BankViewModel());

        binding.button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] Language = getResources().getStringArray(R.array.language_names);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Chọn ngôn ngữ")
                        .setSingleChoiceItems(R.array.language_names, -1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (Language[i].equals("Việt Nam")) {
                                    resources = LocaleHelper.setLocale(context, "vi").getResources();
                                    binding.textView.setText(resources.getString(R.string.title));
                                    binding.edtNumber.setHint(resources.getString(R.string.hint));
                                    binding.button.setText(resources.getString(R.string.textbtn));
                                    Toast.makeText(context, Language[i], Toast.LENGTH_SHORT).show();


                                }

                                if (Language[i].equals("English")) {
                                    resources = LocaleHelper.setLocale(context, "en").getResources();
                                    binding.textView.setText(resources.getString(R.string.title));
                                    binding.edtNumber.setHint(resources.getString(R.string.hint));
                                    binding.button.setText(resources.getString(R.string.textbtn));
                                    Toast.makeText(context, Language[i], Toast.LENGTH_SHORT).show();

                                }
                            }
                        });

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                builder.create().show();
            }
        });


    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.custom_view, this, true);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
