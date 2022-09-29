package com.klasa3p.szkola;

public sealed class Teacher extends Person implements Orderly permits Wychowawca {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void doDuty() {
        System.out.println("szpacer po korytrarzu");
    }
}
