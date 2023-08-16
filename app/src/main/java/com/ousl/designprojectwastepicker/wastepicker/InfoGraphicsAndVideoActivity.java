package com.ousl.designprojectwastepicker.wastepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wastepicker.R;

public class InfoGraphicsAndVideoActivity extends AppCompatActivity implements SensorEventListener {

     TextView textView;
     ImageView imageView;
     private SensorManager sensorManager;
     private Float changeValue ;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_graphics_and_videos);

        imageView = findViewById(R.id.info_back_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoGraphicsAndVideoActivity.this, EducationalResourceActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView = findViewById(R.id.info_noti_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoGraphicsAndVideoActivity.this, NotificationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.video1);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        textView = findViewById(R.id.txt_sensor);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        changeValue = event.values[0];
        textView.setText(String.valueOf(changeValue));

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.
                TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }
}