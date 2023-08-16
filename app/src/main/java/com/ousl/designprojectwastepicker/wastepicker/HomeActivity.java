package com.ousl.designprojectwastepicker.wastepicker;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.wastepicker.R;

public class HomeActivity extends AppCompatActivity  implements View.OnClickListener {

    private CardView Schedule, LiveTrack, SpecialRequest, EducationalResources, Feedback, Notification ;
    private ImageView imageView;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageView = findViewById(R.id.profile);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button = findViewById(R.id.btn_set_location);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LocationActivity.class);
                startActivity(intent);
                finish();
            }
        });




        Schedule = (CardView) findViewById(R.id.schedule);
        LiveTrack = (CardView) findViewById(R.id.live_track);
        SpecialRequest = (CardView) findViewById(R.id.specialRequest);
        EducationalResources = (CardView) findViewById(R.id.eduResources);
        Feedback = (CardView) findViewById(R.id.feedback);
        Notification = (CardView) findViewById(R.id.notification);

        Schedule.setOnClickListener((View.OnClickListener) this);
        LiveTrack.setOnClickListener((View.OnClickListener) this);
        SpecialRequest.setOnClickListener((View.OnClickListener) this);
        EducationalResources.setOnClickListener((View.OnClickListener) this);
        Feedback.setOnClickListener((View.OnClickListener) this);
        Notification.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {
        Intent intent ;
        switch (view.getId()){
            case R.id.live_track:intent = new Intent(this, LiveTrackActivity.class); startActivity(intent); break;
            case R.id.eduResources:intent = new Intent(this,EducationalResourceActivity.class); startActivity(intent); break;
            case R.id.specialRequest:intent = new Intent(this,SpecialRequestActivity.class); startActivity(intent); break;
            case R.id.schedule:intent = new Intent(this,ScheduleActivity.class); startActivity(intent); break;
            case R.id.feedback:intent = new Intent(this,FeedbackActivity.class); startActivity(intent); break;
            case R.id.notification:intent = new Intent(this,NotificationActivity.class); startActivity(intent); break;

        }
    }
}
