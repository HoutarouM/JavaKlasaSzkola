package com.klasa3p.szkola;

import java.util.ArrayList;

public class Class {
    private ArrayList<Student> students = new ArrayList<>();

    private String nameOfClass;

    private Wychowawca wychowawca;

    public Class(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public Class(ArrayList<Student> students, String nameOfClass) {
        this.students = students;
        this.nameOfClass = nameOfClass;
    }

    public Class(ArrayList<Student> students, String nameOfClass, Wychowawca wychowawca) {
        this.students = students;
        this.nameOfClass = nameOfClass;
        this.wychowawca = wychowawca;
    }

    public Class(String nameOfClass, Wychowawca wychowawca) {
        this.nameOfClass = nameOfClass;
        this.wychowawca = wychowawca;
    }

    /**
     * @param student
     * @return
     */
    private boolean isStudentInTheClass(Student student) {
        return students.contains(student);
    }

    /**
     * add object Student to students ArrayList
     *
     * @param student object of Student class
     * @return
     */
    public void addStudentToTheClass(Student student) {
        if (isStudentInTheClass(student)) {
            System.out.println("Nie mozna dodac ucznia");

            return;
        }

        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "students=" + students +
                ", nameOfClass='" + nameOfClass + '\'' +
                ", wychowawca=" + wychowawca +
                '}';
    }
}
