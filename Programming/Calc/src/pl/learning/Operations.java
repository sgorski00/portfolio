package pl.learning;

public class Operations {
    public double makeOperation(char symbol, double a, double b) {
        double result = 0;
        switch (symbol) {
            case '+' -> result = addition(a,b);
            case '-' -> result =substraction(a,b);
            case '/' -> result = division(a,b);
            case '*' -> result = mulitplication(a,b);
        }
        return result;
    }

    private double addition(double a, double b) {
        return a + b;
    }

    private double division(double a, double b) {
        return a / b;
    }

    private double mulitplication(double a, double b) {
        return a * b;
    }

    private double substraction(double a, double b) {
        return a - b;
    }
}
