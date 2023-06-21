import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals animals = new Animals();
        Items items = new Items();
        Food food = new Food();
        Cars cars = new Cars();
        Hangman hangman = new Hangman();

        String[] categories = new String[] {"Animals", "Items", "Food", "Cars"};
        System.out.println("Categories:");
        for(int i = 0; i < categories.length; i++){
            System.out.println((i + 1) + " " + categories[i]);
        }

        System.out.println("Choose category (1-4): ");
        int index = scanner.nextInt();
        if(index >= 1 && index <= 4){
            switch (index) {
                case 1 -> {
                    hangman.words = animals.array;
                    System.out.println("Your choice is 'animals'.");
                    hangman.play();
                }
                case 2 -> {
                    hangman.words = items.array;
                    System.out.println("Your choice is 'items'.");
                    hangman.play();
                }
                case 3 -> {
                    hangman.words = food.array;
                    System.out.println("Your choice is 'food'.");
                    hangman.play();
                }
                case 4 -> {
                    hangman.words = cars.array;
                    System.out.println("Your choice is 'cars'.");
                    hangman.play();
                }
            }
        } else {
            System.out.println("Enter correct category! (1-4)");
        }

        scanner.close();
    }
}