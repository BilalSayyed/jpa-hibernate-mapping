package com.busycoder.many2manybi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "emp5")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double amount;
    @ManyToMany
   @JoinTable(name = "e_dtable")
    private List<Department> dept;

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

    public Employee(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

//    public Employee(String name, double amount, Department dept) {
//        this.name = name;
//        this.amount = amount;
//        this.dept=dept;
//    }
//
//    public Department getDept() {
//        return dept;
//    }
//
//    public void setDept(Department dept) {
//        this.dept = dept;
//    }

    public Employee(int id, String name, double amount, List<Department> dept) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.dept = dept;
    }
}
