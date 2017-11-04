package com.example.anwesha.replica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.anwesha.replica.R.id.notification;

public class notifications extends AppCompatActivity {
    private EditText notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        notification = (EditText)findViewById(R.id.notification);
    }
    public void ishu(View view) {
        String notification1 = notification.getText().toString();
        String type = "notify";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,notification1);
    }

    /**
     * Created by Anwesha on 11/1/2017.
     */

    public static class register {
    }
}
