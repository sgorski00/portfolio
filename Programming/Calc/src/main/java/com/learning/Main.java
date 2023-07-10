package com.learning;

public class Main {
    public static void main(String[] args) {
        Result mathOperationResult = new Result();

        double result = mathOperationResult.result();
        double a = mathOperationResult.getA();
        double b = mathOperationResult.getB();
        char mathSymbol = mathOperationResult.getMathSymbol();
        System.out.println(a + " " + mathSymbol + " " + b + " = " + result);
    }
}