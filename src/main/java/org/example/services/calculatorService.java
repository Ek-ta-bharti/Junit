package org.example.services;

public class calculatorService {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int SumAnyNumbers(int ...numbers){
        int s=0;
        for(int n:numbers){
            s+=n;
        }
        return s;
    }
}

