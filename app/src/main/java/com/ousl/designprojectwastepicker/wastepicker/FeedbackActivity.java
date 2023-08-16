package com.ousl.designprojectwastepicker.wastepicker;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wastepicker.R;

public class FeedbackActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private EditText feedbackEditText;
    private Button submitButton;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        imageView = findViewById(R.id.feedback_back_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeedbackActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ratingBar = findViewById(R.id.ratingBar);
        feedbackEditText = findViewById(R.id.feedbackEditText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                String feedback = feedbackEditText.getText().toString();

                // Handle the feedback submission here
                // For now, we'll just show a toast message with the feedback
                String message = "Feedback: " + feedback + "\nRating: " + rating;
                Toast.makeText(FeedbackActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
