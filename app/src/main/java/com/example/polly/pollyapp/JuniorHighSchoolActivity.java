package com.example.polly.pollyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author Adil Soomro
 *
 */
public class JuniorHighSchoolActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junoir_actvity);
        
    }
    public void juniorHighSchool(View s)
    {
    	Toast.makeText(this, "我的高中：\n成都市顺江学校", Toast.LENGTH_LONG).show();
    }
}
