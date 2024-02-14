package org.example.byteCode;

public class FinallyClass {
    void tryCatchFinally() {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            doSomething();
        }
    }
    private void doSomething() {
    }
}
