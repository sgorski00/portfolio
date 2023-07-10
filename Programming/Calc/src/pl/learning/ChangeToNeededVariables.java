package pl.learning;

public class ChangeToNeededVariables extends GetValuesFromUsers {
    public double firstNumber() {
        boolean isSuccesful = false;
        double number = 0;
        while (!isSuccesful) {
            try {
                number = Double.parseDouble(getFirstNumber());
                isSuccesful = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Enter correct value!");
            }
        }
        return number;
    }

    public double secondNumber() {
        double number = 0;
        boolean isScuccesful = false;
        while (!isScuccesful) {
            try {
                number = Double.parseDouble(getSecondNumber());
                isScuccesful = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Enter correct value!");
            }
        }
        return number;
    }

    public char mathSymbol() {
        boolean isSuccesful = false;
        char symbol = getSymbol().charAt(0);

        while (!isSuccesful) {
            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                isSuccesful = true;
            } else {
                System.err.println("Enter correct Math symbol! ('+', '-', '*' or '/')");
                symbol = getSymbol().charAt(0);
            }
        }
        return symbol;
    }
}
