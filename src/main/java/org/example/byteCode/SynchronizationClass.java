package org.example.byteCode;

public class SynchronizationClass {
    void onlyMe(Object f) {
        synchronized(f) {
            doSomething();
        }
    }

    private void doSomething() {
    }
}
