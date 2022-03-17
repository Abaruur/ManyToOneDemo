package com.paerscholas.model;

import com.paerscholas.model.Department;
import com.paerscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class mycontroller {
    public void creatTablesOnetoMany()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
    }

    public void insertRecordOnetoMany()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
            //-------------- creating TEachers Objects
        Teacher t1 = new Teacher();
        t1.setSalary("200");
        t1.setTeachername("Haseeb");

        Teacher t2 = new Teacher();
        t2.setSalary("300");
        t2.setTeachername("james");

        Teacher t3 = new Teacher();
        t3.setSalary("5896");
        t3.setTeachername("Jared");

        Teacher t4 = new Teacher();
        t4.setSalary("3698");
        t4.setTeachername("Jennifer");

        Teacher t5 = new Teacher();
        t5.setSalary("258");
        t5.setTeachername("Shujata");

        Teacher t6 = new Teacher();
        t6.setSalary("258");
        t6.setTeachername("Shujata");

        Teacher t7 = new Teacher();
        t7.setSalary("258");
        t7.setTeachername("Alex");
        //----------------- creating Teacher List----------
        Set<Teacher> teachlist = new HashSet<>();
        teachlist.add(t1);
        teachlist.add(t2);
        teachlist.add(t3);
        teachlist.add(t4);

        Set<Teacher> teacherlistTwo = new HashSet<>();

        teacherlistTwo.add(t5);
        teacherlistTwo.add(t6);
        teacherlistTwo.add(t7);


        // -------------Create Department----------
        Department d1 = new Department();
        d1.setDname("Computer Science");
        d1.setTeachList(teachlist);


        Department d2 = new Department();
        d2.setDname("Math");
        d2.setTeachList(teacherlistTwo);

        Department d3 = new Department();
        d3.setDname("biology");

        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        session.save(t5);
        session.save(t6);
        session.save(t7);

        session.save(d1);
        session.save(d2);
        session.save(d3);

        t.commit();
        session.close();
        factory.close();

    }
}