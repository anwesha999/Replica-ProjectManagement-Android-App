package com.example.anwesha.replica;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton androidImageButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidImageButton = (ImageButton) findViewById(R.id.image_button_android);
        androidImageButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,project.class);
                startActivity(intentLoadNewActivity);
            }
        });
        Vibrator vibrator=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(100);
        MediaPlayer mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.button);
        mediaPlayer.start();

    }

    public void new1(View view) {
        Intent intent = new Intent(MainActivity.this,project.class);
        startActivity(intent);
    }

    public void new2(View view) {
        Intent intent = new Intent(MainActivity.this,felicitates.class);
        startActivity(intent);
    }
    public void new3(View view) {
        Intent intent = new Intent(MainActivity.this,project.class);
        startActivity(intent);
    }
}