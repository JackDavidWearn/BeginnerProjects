package BeginnerProjects.StringReverse;

import java.util.Scanner;

/*
 * 
 * In Java, strings refer to sequences of characters that behave like an object within the Java environment. 
 * It’s a very common and widely used Java data structure, storing data in an array of characters. 
 * Creating a simple application that reverses a string can help you understand strings and how they’re used in a Java environment.
 * For example, creating a program that reverses a string the user enters (e.g., “HELLO” to “OLLEH”). This project has many possible solutions, 
 * which is a key concept to understand as you start coding. And, oftentimes the best solution can change depending on the attributes and objective of the project you’re working on.
 * 
*/

public class Main {

    public static void reversed(char[] characterArray) {
        
        char[] reversed = new char[characterArray.length];
        for(int i = characterArray.length - 1; i >= 0; i--) {
            reversed[i] = characterArray[i];
            System.out.print(reversed[i]);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word you would like reversed: ");

        String inputString = sc.nextLine();
        sc.close();

        char[] charArray = inputString.toCharArray();

        reversed(charArray);

        System.out.println();
        

    }
    
}
