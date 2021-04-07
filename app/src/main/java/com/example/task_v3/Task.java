package com.example.task_v3;

import java.util.Date;
import java.util.List;

public class Task {
    public String name;
    public int quantity;
    public Date date;
    public String category;
    public static List<Task> Tasks;

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

    public List<Task> getTasks() {
        return Tasks;
    }

    public static void setTasks(List<Task> tasks) {
        Tasks = tasks;
    }
}
