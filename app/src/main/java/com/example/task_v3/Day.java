package com.example.task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

public class Day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        ArrayList<Task> tasks = Task.getTasks();
        BarChart chart = (BarChart) findViewById(R.id.chart);
        List<BarEntry> entries = new ArrayList<BarEntry>();

        for(int i = 0 ; i < 5; i++)
        {
            entries.add(new BarEntry(i,Task.Sum(Task.getCategoryarr()[i])));
        }
        BarDataSet[] bar=new BarDataSet[5];
        for(int i = 0; i < 5; i++)
        {
            bar[i]=new BarDataSet(entries,Task.getCategoryarr()[i]);
        }
        BarData lineData = new BarData(bar);
        chart.setData(lineData);
        chart.invalidate(); // refresh

//        ListView TaskList = (ListView) findViewById(R.id.daylist);
//        ArrayAdapter<Task> adapter = new ArrayAdapter<Task>(this, android.R.layout.simple_list_item_1, Task.getTasks());
//        TaskList.setAdapter(adapter);
    }

    public void addclick(View view) {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }

    public void monthclick(View view) {
        Intent myIntent = new Intent(view.getContext(), Month.class);
        startActivityForResult(myIntent, 0);
    }
}