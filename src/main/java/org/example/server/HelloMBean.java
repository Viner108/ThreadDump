package org.example.server;

import org.example.Person;

public interface HelloMBean {
    void sayHello();
    int addIntegers(int a,int b);
    Person returnPerson();
    String getName();
    void setName(String name);

}
