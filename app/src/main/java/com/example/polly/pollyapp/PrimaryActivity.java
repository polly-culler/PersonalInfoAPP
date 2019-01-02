package com.example.polly.pollyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PrimaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
    }
    public void primaryHighSchool(View s)
    {
        Toast.makeText(this, "小学学校：\n成都市顺江学校", Toast.LENGTH_LONG).show();
    }
}
