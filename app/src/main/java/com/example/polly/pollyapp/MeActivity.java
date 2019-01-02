package com.example.polly.pollyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author Adil Soomro
 *
 */
public class MeActivity extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me_activity);
    }

    public void subject(View v)
    {
        Toast.makeText(this, "计算机科学与技术", Toast.LENGTH_LONG).show();
    }
    public void name(View v) {
        Toast.makeText(this, "polly", Toast.LENGTH_LONG).show();
    }
    public void school(View v) {
        Toast.makeText(this, "四川理工学院", Toast.LENGTH_LONG).show();
    }
    public void place(View v) {
        Toast.makeText(this, "四川成都", Toast.LENGTH_LONG).show();
    }
}