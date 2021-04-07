package com.example.task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Month extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        ListView TaskList = (ListView) findViewById(R.id.monthlist);
        ArrayAdapter<Task> adapter = new ArrayAdapter<Task>(this, android.R.layout.simple_list_item_1, Task.getTasks());
        TaskList.setAdapter(adapter);
    }

    public void addclick(View view) {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }

    public void dayclick(View view) {
        Intent myIntent = new Intent(view.getContext(), Day.class);
        startActivityForResult(myIntent, 0);
    }
}