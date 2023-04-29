package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.customdialogs.Dialogs.CustomDialogProvider;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogProvider customDialogProvider = new CustomDialogProvider();
                customDialogProvider.showDialog(CustomDialogProvider.eType.ERROR, MainActivity.this, "liron");
            }
        });
    }
}