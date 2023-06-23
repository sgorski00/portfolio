import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException, IllegalArgumentException {
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
                throw new IllegalArgumentException("Enter correct sign! ('+', '-', '*' or '/'");
            } else if ((a == 0 || b == 0) && sign == '/'){
                throw new ArithmeticException("Cannot be divided by 0!");
            }

            switch(sign) {
                case '+':
                    calculations.addition(a, b);
                    break;
                case '-':
                    calculations.substraction(a, sign, b);
                    break;
                case '*':
                    calculations.multiplication(a, b);
                    break;
                case '/':
                        calculations.division(a, b);
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