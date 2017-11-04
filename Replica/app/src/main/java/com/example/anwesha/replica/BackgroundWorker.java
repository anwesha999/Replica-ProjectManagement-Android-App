package com.example.anwesha.replica;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Anwesha on 11/1/2017.
 */

class BackgroundWorker extends AsyncTask<String,Void,String> {
    Context context;
    AlertDialog alertDialog;
    BackgroundWorker (Context ctx) {
        context = ctx;
    }
    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String register_url = "http://172.16.9.215/register.php";
        String project1_url = "http://172.16.9.215/project1.php";
        String notify_url = "http://172.16.9.215/notifications.php";
        if (type.equals("register")) {
            try {
                String name = params[1];
                String semester = params[2];
                String college = params[3];
                String event = params[4];
                String username = params[5];
                String password = params[6];
                URL url = new URL(register_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&"
                        +URLEncoder.encode("semester", "UTF-8") + "=" + URLEncoder.encode(semester, "UTF-8") + "&"
                        +URLEncoder.encode("college", "UTF-8") + "=" + URLEncoder.encode(college, "UTF-8") + "&"
                        +URLEncoder.encode("event", "UTF-8") + "=" + URLEncoder.encode(event, "UTF-8") + "&"
                        +URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(username, "UTF-8") + "&"
                        + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String result = "";
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }}
        else if (type.equals("project1")) {
            try {
                String Project_Name = params[1];
                String Desc_of_project = params[2];
                String Assigned_to = params[3];
                String phone_no = params[4];
                String email_id= params[5];
                String date_due_of_the_project= params[6];
                String duration_of_the_project= params[7];
                String phase= params[8];
                String spinner4= params[9];
                String spinner5= params[10];
                URL url = new URL(project1_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("Project_Name", "UTF-8") + "=" + URLEncoder.encode(Project_Name, "UTF-8") + "&"
                        +URLEncoder.encode("Desc_of_project", "UTF-8") + "=" + URLEncoder.encode(Desc_of_project, "UTF-8") + "&"
                        +URLEncoder.encode("Assigned_to", "UTF-8") + "=" + URLEncoder.encode(Assigned_to, "UTF-8") + "&"
                        +URLEncoder.encode("phone_no", "UTF-8") + "=" + URLEncoder.encode(phone_no, "UTF-8") + "&"
                        +URLEncoder.encode("email_id", "UTF-8") + "=" + URLEncoder.encode(email_id, "UTF-8") + "&"
                        + URLEncoder.encode("date_due_of_the_project", "UTF-8") + "=" + URLEncoder.encode(date_due_of_the_project, "UTF-8")+ "&"
                        +URLEncoder.encode("duration_of_the_project", "UTF-8") + "=" + URLEncoder.encode(duration_of_the_project, "UTF-8") + "&"
                        +URLEncoder.encode("phase", "UTF-8") + "=" + URLEncoder.encode(phase, "UTF-8") + "&"
                        + URLEncoder.encode("spinner4", "UTF-8") + "=" + URLEncoder.encode(spinner4, "UTF-8")+ "&"
                        + URLEncoder.encode("spinner5", "UTF-8") + "=" + URLEncoder.encode(spinner5, "UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String result = "";
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }}
        if (type.equals("notify")) {
            try {
                String  notification  = params[1];
                URL url = new URL(notify_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("notification", "UTF-8") + "=" + URLEncoder.encode(notification, "UTF-8") ;
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String result = "";
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }}
        return null;
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
       alertDialog.setTitle("Login Status");

    }

    @Override
    protected void onPostExecute(String result) {
        alertDialog.setMessage(result);
        alertDialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}



