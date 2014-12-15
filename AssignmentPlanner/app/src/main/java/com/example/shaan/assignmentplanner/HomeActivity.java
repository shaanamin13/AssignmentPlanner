package com.example.shaan.assignmentplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;


public class HomeActivity extends FragmentActivity {



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