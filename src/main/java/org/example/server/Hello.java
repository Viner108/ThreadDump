package org.example.server;

import org.example.Person;

public class Hello implements HelloMBean {
    private String name;
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public int addIntegers(int a, int b) {
        return a+b;
    }

    @Override
    public Person returnPerson() {
        return new Person();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
