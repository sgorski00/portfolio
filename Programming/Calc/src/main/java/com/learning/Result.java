package com.learning;

public class Result extends Operations {
    private final ChangeToNeededVariables changedVar = new ChangeToNeededVariables();
    private double a = changedVar.firstNumber();
    private char mathSymbol = changedVar.mathSymbol();
    private double b = changedVar.secondNumber();

    public double result() {
        boolean isDivisionOk = false;
        while(!isDivisionOk){
            if (mathSymbol == '/' && (a == 0 || b == 0)) {
                while (a == 0 || b == 0) {
                    System.err.println("Can not be divided by 0! Enter correct values.");
                    a = changedVar.firstNumber();
                    b = changedVar.secondNumber();
                    if (a != 0 && b != 0) {
                    }
                }
            }
            isDivisionOk = true;
        }
        return makeOperation(mathSymbol, a, b);
    }

    public double getA() {
        return a;
    }

    public char getMathSymbol() {
        return mathSymbol;
    }

    public double getB() {
        return b;
    }
}
