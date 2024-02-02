package org.example;

public class HelloWorld implements HelloWorldBean{
private String massage;
    @Override
    public String getMassage() {
        return massage;
    }

    @Override
    public void setMassage(String massage) {
this.massage=massage;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, "+massage+"!");
    }
}
