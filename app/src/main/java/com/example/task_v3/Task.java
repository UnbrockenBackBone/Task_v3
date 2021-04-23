package com.example.task_v3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    public String name;
    public int quantity;
    public Date date;
    public String category;
    public static ArrayList<Task> Tasks = new ArrayList<>();
    public static String[] categoryarr = { "Іжа", "Розваги", "Кіно", "Фастфуд", "Квіти"};

    public static String[] getCategoryarr() {
        return categoryarr;
    }

    public void setCategoryarr(String[] categoryarr) {
        this.categoryarr = categoryarr;
    }

    public Task(String name, int quantity, Date date, String category) {
        this.name = name;
        this.quantity = quantity;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static ArrayList<Task> getTasks() {
        return Tasks;
    }

    public static void setTasks(ArrayList<Task> tasks) {
        Tasks = tasks;
    }

    @Override
    public String toString() {
        return
                "Категорія: " + category + " Призначення: "+ name + " Сума: " + quantity + " Дата: " + date;
    }
    public static int Sum(String category)
    {
        int money=0;
        for (Task object:Tasks) {
            if(object.getCategory().equals(category))
            {
                money+=object.getQuantity();
            }
        }
        return money;
    }
}
