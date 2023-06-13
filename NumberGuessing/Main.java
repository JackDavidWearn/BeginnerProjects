package BeginnerProjects.NumberGuessing;

import java.util.Scanner;

/*
 * 
 * This is a simple game that can help you get your feet wet with Java. The game is relatively simple — the computer generates a random number, 
 * and the user must guess the number. The computer will then let the user know that their guess is too high, too low, or correct. 
 * This can be free-form, allowing an unlimited number of guesses, or give the user a set number of guesses before the game ends.
 * 
*/

public class Main {
    
    public static void main(String[] args) {
        
        int counter = 0;
        int randomNumber = (int) (Math.random() * 101);

        System.out.println("You only have 10 guesses to find the correct random number, so guess wisely!");

        while(counter <= 10) {

            Scanner sc = new Scanner(System.in);

            int guess = sc.nextInt();

            if(guess == randomNumber) {
                System.out.println("You got it right!");
                counter = 11;
            } else if(guess > randomNumber) {
                System.out.println("Your guess was too big!");
                counter += 1;
            } else {
                System.out.println("Your guess is too low!");
                counter += 1;
            }

        }

        System.out.println("The random number was " + randomNumber);

    }


}