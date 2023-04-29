package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.customdialogs.Dialogs.CustomDialogProvider;

public class MainActivity extends AppCompatActivity {
    private Button error_button, warning_button, info_button, success_button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        error_button = findViewById(R.id.error_button);
        warning_button = findViewById(R.id.warning_button);
        info_button = findViewById(R.id.info_button);
        success_button = findViewById(R.id.success_button);

        CustomDialogProvider customDialogProvider = new CustomDialogProvider();

        error_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialogProvider.showDialog(CustomDialogProvider.eType.ERROR, MainActivity.this, "Error");
            }
        });
        warning_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialogProvider.showDialog(CustomDialogProvider.eType.WARNING, MainActivity.this, "warning");
            }
        });
        info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialogProvider.showDialog(CustomDialogProvider.eType.INFO, MainActivity.this, "info");
            }
        });
        success_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialogProvider.showDialog(CustomDialogProvider.eType.SUCCESS, MainActivity.this, "success");
            }
        });
    }
}