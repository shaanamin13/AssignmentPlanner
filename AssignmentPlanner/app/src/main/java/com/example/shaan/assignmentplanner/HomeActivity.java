package com.example.shaan.assignmentplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Shaan on 11/9/2014.
 */
public class HomeActivity extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void addAssignment(View view){
        Intent intent = new Intent(HomeActivity.this, NewAssignmentsActivity.class);
        startActivity(intent);

    }


}