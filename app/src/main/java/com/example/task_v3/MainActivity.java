package com.example.task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Task> tasks;
    String[] category = { "Іжа", "Розваги", "Кіно", "Фастфуд", "Квіти"};
    int[] myimage = new int[]{R.drawable.food, R.drawable.entertainment, R.drawable.cinema, R.drawable.fastfood, R.drawable.flowers};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.category);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, category);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        ImageView imageView = (ImageView) findViewById(R.id.imagecategory);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)parent.getItemAtPosition(position);
                imageView.setImageResource(myimage[position]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }

    public void buttonclick(View view) {
        EditText Name = (EditText) findViewById(R.id.name);
        String name = Name.getText().toString();
        Spinner Category = (Spinner) findViewById(R.id.category);
        String category = Category.getSelectedItem().toString();
        EditText Sum = (EditText) findViewById(R.id.sum);
        Integer sum = Integer.parseInt(Sum.getText().toString());
        EditText Date = (EditText) findViewById(R.id.date);
        java.util.Date date = java.sql.Date.valueOf(String.valueOf(Date.getText()));
        tasks.add(new Task(name,sum, date,category));
        Task.setTasks(tasks);
        Toast toast = Toast.makeText(this, "Успішно додано!", Toast.LENGTH_LONG);
        toast.show();
    }
}