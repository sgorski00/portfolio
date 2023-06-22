import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        Scanner scanner = new Scanner(System.in);
        Scanner x = new Scanner(System.in);

        try{
            System.out.println("Enter first number");
            double a = scanner.nextDouble();

            System.out.println("What Math operation do you want to perform? ('+', '-', '*', '/')");
            char sign = x.nextLine().charAt(0);

            System.out.println("Enter second number");
            double b = scanner.nextDouble();

            if(!(sign == '+' || sign == '-' || sign == '*' || sign == '/')){
                System.out.println("Enter correct sign! ('+', '-', '*', '/')");
                System.exit(0);
            }

            switch(sign) {
                case '+':
                    calculations.addition(a, b);
                    break;
                case '-':
                    calculations.substraction(a, b);
                    break;
                case '*':
                    calculations.multiplication(a, b);
                    break;
                case '/':
                    if(a == 0 || b == 0) {
                        System.out.println("Cannot be divided by 0!");
                        System.exit(0);
                    }else {
                        calculations.division(a, b);
                    }
                    break;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Enter correct data! (Only numbers.)");
        }
        finally {
            System.out.println(calculations.result);
        }
    scanner.close();
    }
}