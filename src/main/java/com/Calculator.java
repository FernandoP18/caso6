package com.smartbuild;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // Podrías agregar fallos intencionales para análisis estático:
    public int subtract(int a, int b) {
        return a - b;
    }
}
