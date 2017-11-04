package com.example.anwesha.replica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class project extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
    }
    public void next(View view) {
        Intent intent = new Intent(project.this,project1.class);
        startActivity(intent);
    }
    public void next1(View view) {
        Intent intent = new Intent(project.this,myprofile.class);
        startActivity(intent);
    }

    public void next2(View view) {
        Intent intent = new Intent(project.this, notifications.class);
        startActivity(intent);
    }
    public void next4(View view) {
        Intent intent = new Intent(project.this, Chat.class);
        startActivity(intent);
    }
    public void next5(View view) {
        Intent intent = new Intent(project.this, GanttChart.class);
        startActivity(intent);
    }
}
