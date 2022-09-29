package com.klasa3p.szkola;

public class Student extends Person implements Orderly {
    //    domyslnie 0
    public static int countOfStudents;
    private int nrOfStudent;

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

    @Override
    public void doDuty() {
        System.out.println("Czysta tablica");
    }
}
