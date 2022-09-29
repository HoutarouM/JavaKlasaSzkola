package com.klasa3p.szkola;

import java.util.ArrayList;

public class School {
    //    single ton wzorzec projectory
//    uzywamy kiedy powinna byc utworzona tylko jedna instacja danej klasy
//    jedna z metod
    private static School school = new School();

    private ArrayList<Class> classes = new ArrayList<>();

    private School() {
    }

    public static School getSchool() {
        return school;
    }

    public void addClassToSchool(Class schoolClass) {
        if (classes.contains(schoolClass)) {
            System.out.println("Klasa juz istnije");

            return;
        }

        classes.add(schoolClass);
    }

    /**
     * Dodaje ucznia do klasy, jesli juz jest uczniem jakiejs klasy to usuwamy z tej klasy i dodajemy do nowej
     *
     * @param student     uczen ktory powinien byc dodany do klasy
     * @param schoolClass klasa do ktorej powinien dodany
     */
    public void addStudentToClass(Student student, Class schoolClass) {
        for (Class cla : classes) {
            ArrayList<Student> classStudents = cla.getStudents();

            if (classStudents.contains(student)) {
                classStudents.remove(student);

                cla.setStudents(classStudents);
            }
        }

        schoolClass.addStudentToTheClass(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }
}
