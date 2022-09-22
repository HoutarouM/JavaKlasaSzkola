package com.klasa3p.szkola;

public class Student extends Person {
    private int nrOfStudent;

//    domyslnie 0
    public static int countOfStudents;

    public Student(String name, int age) {
//        wywolanie konstruktora klasy bazowej(rodzica)
        super(name, age);

        countOfStudents++;
        this.nrOfStudent = countOfStudents;
    }
}
