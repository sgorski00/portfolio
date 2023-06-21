import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    String[] words;
    String word;
    char[] userWord;
    int lives = 3;

    public void play(){
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        word = words[rnd.nextInt(words.length)];

        userWord = new char[word.length()];
        Arrays.fill(userWord, '_');

        System.out.println("Let's start the game!");
        System.out.println("Your word is: ");
        System.out.print(userWord);

        while(lives>0 && !(word.equals(String.valueOf(userWord)))){
            System.out.println();
            System.out.println("Enter a letter: ");
            char letter = scanner.nextLine().charAt(0);
            boolean foundLetter = false;

            for (int i = 0; i < word.length(); i++){
                if(word.charAt(i) == letter){
                    if(userWord[i] == letter){
                        lives--;
                        System.out.println("You already entered this letter! You lose one life.");
                        if (lives == 1) {
                            System.out.println("You have " + lives + " life");
                        } else {
                            System.out.println("You have " + lives + " lives");
                        }
                    }else{
                        userWord[i] = letter;
                        System.out.println("You guessed a letter!");
                        System.out.println(userWord);
                    }
                    foundLetter = true;
                }
            }

            if (!foundLetter){
                System.out.println("There is no letter like this.");
                lives--;
                if (lives == 1) {
                    System.out.println("You have " + lives + " life");
                } else {
                    System.out.println("You have " + lives + " lives");
                }
            }
        }

        if (lives == 0) {
            System.out.println("You lose the game. Try again.");
        } else {
            System.out.println("You won the game!");
        }

        scanner.close();
    }
}
