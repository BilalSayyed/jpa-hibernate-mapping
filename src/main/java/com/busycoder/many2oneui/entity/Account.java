package com.busycoder.many2oneui.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Account {
    private int id;
    private String name;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}
