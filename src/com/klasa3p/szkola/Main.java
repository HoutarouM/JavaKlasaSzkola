package com.klasa3p.szkola;

public class Main {
    public static void main(String[] args) {
//        brak modyfikatora dostepu dostep wewnatrz pakietu
//        nie mozemy tworzyc person bo jest klasa abstrakcyjna
//        protekted wewnatrz klasy dziedzikow i paketu
//        w konstruktorze klasy potomnej super piwinien byc pierwszym
        Student janek = new Student("Jas", 11);

        System.out.println(janek);

        Teacher teacher = new Wychowawca("Name", 22, "przedmioty zawodowe");

        System.out.println(teacher);
    }
}