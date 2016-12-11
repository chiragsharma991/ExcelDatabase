package com.example.chari.listtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    SqlLiteDbHelper dbHelper;
    Contact contacts ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new SqlLiteDbHelper(this);

        dbHelper.openDataBase();
        contacts = new Contact();

        //jjjsdfsdfsdf
        //sdfsdf


    }
    public void Getdata(View view)
    {
        Log.e("on click","log");

        contacts = dbHelper.Get_ContactDetails();
        TextView tv1 = (TextView)findViewById(R.id.textView1);

        tv1.setText("Name: "+contacts.getName()+"\n Mobile No: "+contacts.getMobileNo());



    }


}
