package org.example;

import org.example.entity.*;
import org.example.entity.project.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class App{
    public static void main( String[] args ) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Groups.class).addAnnotatedClass(Marks.class)
                .addAnnotatedClass(Students.class).addAnnotatedClass(Subjects.class)
                .addAnnotatedClass(Teachers.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();


        Students student = new Students("era","ol");
        Students student2 = new Students("sau","zhas");
        Teachers teachers = new Teachers("Agai","AGAi");
        Marks marks = new Marks(55);
        Marks marks1 = new Marks(33);
        Subjects subjects = new Subjects("algebra");
        Subjects subjects2 = new Subjects("geog");
        Groups groups = new Groups("it2");
        marks.setSubjects(subjects);
        marks1.setSubjects(subjects2);


        student.setMarks(new ArrayList<>(List.of(marks,marks1)));
        student2.setMarks(new ArrayList<>(List.of(marks,marks1)));

        student.setGroups(groups);



        groups.setStudentsList(new ArrayList<>(List.of(student,student2)));
        groups.setTeachersList(new ArrayList<>(List.of(teachers)));

        session.save(student);
        session.save(student2);
        session.save(teachers);
        session.save(marks);
        session.save(marks1);
        session.save(subjects);
        session.save(subjects2);


        session.save(groups);



        session.getTransaction().commit();
        session.close();
    }
}
