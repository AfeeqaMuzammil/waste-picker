package com.ousl.designprojectwastepicker.wastepicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wastepicker.R;

public class SpecialRequestActivity extends AppCompatActivity {

    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_request);

        button = findViewById(R.id.buttonProceed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpecialRequestActivity.this, CreateRequest.class);
                startActivity(intent);
                finish();
            }
        });

        button = findViewById(R.id.buttonCancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpecialRequestActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}