package org.example.byteCode;

public class ExceptionClass {
    void cantBeZero(int i) throws RuntimeException {
        if (i == 0) {
            throw new RuntimeException();
        }
    }

}
