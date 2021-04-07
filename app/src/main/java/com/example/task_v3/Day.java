package com.example.task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        ListView TaskList = (ListView) findViewById(R.id.daylist);
        ArrayAdapter<Task> adapter = new ArrayAdapter<Task>(this,
                android.R.layout.simple_list_item_1, Task.Tasks);
        TaskList.setAdapter(adapter);
    }

    public void addclick(View view) {
    }

    public void monthclick(View view) {
    }
}