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

    public Student(int nrOfStudent, String zmienna) {
        setName(zmienna);
        this.nrOfStudent = nrOfStudent;
    }

    //    override nadpisanie istniejacej metody
    @Override
    public String toString() {
        return "Student " +
                " imie=" + getName() +
                " wiek=" + getAge() +
                " nrOfStudent=" + nrOfStudent;
    }
}
