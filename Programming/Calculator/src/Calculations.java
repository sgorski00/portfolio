import java.util.Scanner;

public class Calculations {
    double result;

    double substraction(double a, char sign, double b){
        result = a - b;
        return result;
    }

    double addition(double a, double b){
        result = a + b;
        return result;
    }

    double multiplication(double a, double b){
        result = a * b;
        return result;
    }

    double division(double a, double b){
        result = a / b;
        return result;
    }
}
