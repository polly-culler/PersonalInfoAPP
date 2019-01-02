package com.example.polly.pollyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author Adil Soomro
 *
 */
public class SeniorHighSchoolActivity extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.senior_activty);
    }

    public void seniorHighSchool(View s)
    {
        Toast.makeText(this, "高中学校：\n成都市第二十中学校", Toast.LENGTH_LONG).show();
    }
}