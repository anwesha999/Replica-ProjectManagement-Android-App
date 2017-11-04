package com.example.anwesha.replica;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class project1 extends AppCompatActivity {
    private EditText Project_Name, Desc_of_project, Assigned_to, phone_no, email_id, date_due_of_the_project,duration_of_the_project,phase;
    private Spinner spinner4,spinner5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
        Project_Name = (EditText)findViewById(R.id.Project_Name);
        Desc_of_project = (EditText)findViewById(R.id.Desc_of_project);
        Assigned_to = (EditText)findViewById(R.id.Assigned_to);
        phone_no = (EditText)findViewById(R.id.phone_no);
        email_id = (EditText)findViewById(R.id.email_id);
        date_due_of_the_project = (EditText)findViewById(R.id.date_due_of_the_project);
        duration_of_the_project = (EditText)findViewById(R.id.duration_of_the_project);
        phase = (EditText)findViewById(R.id.phase);
        spinner4 = (Spinner)findViewById(R.id.spinner4);
        spinner5 = (Spinner)findViewById(R.id.spinner5);
    }

    // public void onClickListener(View view) {
    // Intent i = new Intent(this, fam.class);
    //startActivity(i);
    //}
    //public void next(View view) {
     //   Intent intent = new Intent(project1.this, MainActivity.class);
    //    startActivity(intent);
   // }

    public void next440(View view) {
        String Project_Name1 = Project_Name.getText().toString();
        String Desc_of_project1 = Desc_of_project.getText().toString();
        String Assigned_to1 = Assigned_to.getText().toString();
        String phone_no1 = phone_no.getText().toString();
        String email_id1 = email_id.getText().toString();
        String date_due_of_the_project1 = date_due_of_the_project.getText().toString();
        String duration_of_the_project1 = duration_of_the_project.getText().toString();
        String phase1 = phase.getText().toString();
        String spinner41 = spinner4.getSelectedItem().toString();
        String spinner51 = spinner5.getSelectedItem().toString();
        String type = "project1";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,Project_Name1, Desc_of_project1,Assigned_to1,phone_no1 ,email_id1,date_due_of_the_project1,duration_of_the_project1, phase1,spinner41,spinner51);
    }

}