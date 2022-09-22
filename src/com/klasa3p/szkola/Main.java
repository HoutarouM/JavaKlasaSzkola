package com.klasa3p.szkola;

public class Main {
    public static void main(String[] args) {
//        nie mozemy tworzyc person bo jest klasa abstrakcyjna
        Student janek = new Student("Jas", 11);

        System.out.println(janek);

        Teacher teacher = new Wychowawca("Name", 22, "przedmioty zawodowe");

        System.out.println(teacher);
    }
}