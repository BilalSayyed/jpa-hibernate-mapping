package com.busycoder.one2onebi.entity;



import javax.persistence.*;

//@Entity
//@Table(name = "dept3")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dname;
    @OneToOne(mappedBy = "dept")
    private Employee employee;

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
    public Department(String dname) {

        this.dname = dname;
    }

    public Department() {
    }
}
