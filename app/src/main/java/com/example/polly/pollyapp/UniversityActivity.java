package com.example.polly.pollyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UniversityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
    }
    public void university(View s)
    {
        Toast.makeText(this, "我的大学：\n成都纺织高等专科学校\n四川理工学院", Toast.LENGTH_LONG).show();
    }
}
