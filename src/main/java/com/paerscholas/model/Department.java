package com.paerscholas.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Department {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int did;
    private String dname;

    // Creating Relationship bte Dep and Teacher

    // @OneToMany(cascade = CascadeType.ALL)
    //private Set<Teacher> TeachList;


    @OneToMany(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    private Set TeachList;

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }
    public Department() {

    }

    public Set getTeachList() {
        return TeachList;
    }

    public void setTeachList(Set teachList) {
        TeachList = teachList;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}