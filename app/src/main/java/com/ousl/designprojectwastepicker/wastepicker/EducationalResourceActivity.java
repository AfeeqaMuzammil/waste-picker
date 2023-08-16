package com.ousl.designprojectwastepicker.wastepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.wastepicker.R;

public class EducationalResourceActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_resource);

        button = findViewById(R.id.btn_infographics_and_videos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EducationalResourceActivity.this, InfoGraphicsAndVideoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView = findViewById(R.id.edu_back_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EducationalResourceActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        imageView = findViewById(R.id.edu_noti_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EducationalResourceActivity.this, NotificationActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}