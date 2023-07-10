package com.learning;

import java.util.Scanner;

public class GetValuesFromUsers {
    Scanner scanner = new Scanner(System.in);

    public String getSymbol(){
        System.out.println("Enter operation symbol: ");
        return scanner.nextLine();
    }

    public String getFirstNumber(){
        System.out.println("Enter first number: ");
        return scanner.nextLine();
    }

    public String getSecondNumber(){
        System.out.println("Enter second number: ");
        return scanner.nextLine();
    }
}
