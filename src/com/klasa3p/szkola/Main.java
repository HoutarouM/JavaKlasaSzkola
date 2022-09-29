package com.klasa3p.szkola;

public class Main {
    public static void main(String[] args) {
//        brak modyfikatora dostepu dostep wewnatrz pakietu
//        nie mozemy tworzyc person bo jest klasa abstrakcyjna
//        protekted wewnatrz klasy dziedzikow i paketu
//        w konstruktorze klasy potomnej super piwinien byc pierwszym
//        final finalny punkt. Clasa z final nie dziedziczy sie
//        tools -> generate javaDoc do generowania strony z dokumentacja
        Student janek = new Student("Jas", 11);

        System.out.println(janek);

        Teacher teacher = new Wychowawca("Name", 22, "przedmioty zawodowe");

        System.out.println(teacher);

        School school = School.getSchool();

        Class kl2P = new Class("2P");

        Class kl3P = new Class("3P");

        school.addClassToSchool(kl2P);
        school.addClassToSchool(kl3P);

        school.addStudentToClass(janek, kl2P);
        school.addStudentToClass(janek, kl3P);

        System.out.println(school);
    }
}