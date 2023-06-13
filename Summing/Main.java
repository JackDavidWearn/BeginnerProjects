package BeginnerProjects.Summing;

import java.util.Scanner;

/*
 *
 * A sum-based project is a great way to get started with Java programming. 
 * The project is quite simple — the user will input two numbers (which are treated as the variables A and B), 
 * and the program will add them together and present the sum of A + B. 
 * This can help you learn to work with methods and integers. 
 * JavaTPoint offers a great guide for a Sum A + B project, and working through this type of project can help you become familiar with Java processes.
 * 
*/


public class Main {

    public static int Adding(int x, int y) {

        return x + y;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int n2 = sc.nextInt();

        sc.close();

        int result = Adding(n1, n2);
        System.out.println("The sum of " + n1 + " and " + n2 + " equals: " + result);

    }
    
}
