package com.paerscholas.model;

import javax.persistence.*;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    @Column(name = "TeacherID_PK")
    private int tit;
    private String salary;
    private String Teachername;

    // Relationship is going to create between Teacher and Dep
    @ManyToOne
    @JoinColumn(name = "department_id_FK") // specify the FK col name
    private  Department  Dep;

    public Teacher(int tit, String salary, String teachername, Department dep ) {
        this.tit = tit;
        this.salary = salary;
        this.Teachername = teachername;
        this.Dep = dep;

    }

    public Teacher() {

    }

    public Department getDep() {
        return Dep;
    }

    public void setDep(Department dep) {
        Dep = dep;
    }

    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeachername() {
        return Teachername;
    }

    public void setTeachername(String teachername) {
        Teachername = teachername;
    }
}