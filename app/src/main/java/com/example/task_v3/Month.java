package com.example.task_v3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Month extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        ListView TaskList = (ListView) findViewById(R.id.monthlist);
        ArrayAdapter<Task> adapter = new ArrayAdapter<Task>(this, android.R.layout.simple_list_item_1, filter());
        TaskList.setAdapter(adapter);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public ArrayList<Task> filter()
    {
//        Supplier<Stream<Task>> taskStream = () -> Task.getTasks().stream();
//        //Stream<Task> taskStream = Task.getTasks().stream();
//        System.out.println(taskStream.get().filter(p->p.getDate().getMonth()<10));
//        System.out.println(LocalDate.now().getMonthValue());
//        taskStream.get().filter(p->p.getDate().getMonth() == LocalDate.now().getMonthValue());
//        return (ArrayList<Task>) taskStream.get().collect(Collectors.toList());

        ArrayList<Task> tasks = Task.getTasks();
        tasks.stream().filter(p->p.getDate().getMonth() == LocalDate.now().getMonthValue());
        return tasks;
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