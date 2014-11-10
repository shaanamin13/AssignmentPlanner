package com.example.shaan.assignmentplanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ToggleButton;

import java.util.Date;


public class NewAssignmentsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_assignments, menu);
        return true;
    }



    public void onToggleClicked(View view) {
        // Is the toggle on?
        DatePicker dueDate = (DatePicker) findViewById(R.id.datePicker);
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            // Enable vibrate
          dueDate.setVisibility(View.VISIBLE);
        } else {
            // Disable vibrate
            dueDate.setVisibility(View.GONE);
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
