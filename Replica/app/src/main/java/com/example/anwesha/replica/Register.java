package com.example.anwesha.replica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name, semester, college, event, username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText)findViewById(R.id.et_name);
        semester = (EditText)findViewById(R.id.et_semester);
        college = (EditText)findViewById(R.id.et_college);
        event= (EditText)findViewById(R.id.et_event);
        username= (EditText)findViewById(R.id.et_username);
        password = (EditText)findViewById(R.id.et_password);

    }
    public void OnReg(View view){
        String str_name = name.getText().toString();
        String str_semester = semester.getText().toString();
        String str_college = college.getText().toString();
        String str_event = event.getText().toString();
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_name, str_semester,str_college,str_event, str_username, str_password);
    }

}