import java.util.Scanner;

public class UserChoiceOfItem {
    private Scanner scanner = new Scanner(System.in);

    String chooseCloth(){
        System.out.println("Wybierz ubranie:");
        String userCloth = scanner.nextLine();
        return userCloth;
    }

    String chooseColour(){
        System.out.println("Wybierz kolor:");
        String userColour = scanner.nextLine();
        return userColour;
    }

    String chooseStyle(){
        System.out.println("Wybierz styl:");
        String userStyle = scanner.nextLine();
        return userStyle;
    }
}
