package com.busycoder.many2manyui.entity;

import javax.persistence.*;

//@Entity
//@Table(name = "dept1")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dname;

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
