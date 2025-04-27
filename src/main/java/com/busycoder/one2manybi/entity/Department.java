package com.busycoder.one2manybi.entity;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "dept4")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dname;

    @OneToMany(mappedBy = "dept")
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Department(int id, String dname) {
        this.id = id;
        this.dname = dname;
    }
}
