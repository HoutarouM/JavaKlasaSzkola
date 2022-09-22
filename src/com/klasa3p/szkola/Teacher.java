package com.klasa3p.szkola;

public sealed class Teacher extends Person permits Wychowawca {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
}
