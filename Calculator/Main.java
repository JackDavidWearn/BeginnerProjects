/*
 *
 * Programming a calculator is a great beginning project for people learning many different programming languages, including Java. 
 * It’s a great introduction due to its simplicity and covers many of the most basic programming concepts.
 * This is a great Java project for beginners because you can build your calculator’s functionality as your skills grow. 
 * Initially, your calculator might perform basic functions like addition and subtraction, building in geometric expressions and 
 * scientific calculations as your skills grow. Later on, you can also build in a more complex user interface.
 * 
*/

import java.util.*;

public class Main {

    public static int Adding(int x, int y){
        int sum = x + y;

        return sum;

    }

    public static int Subtraction(int x, int y) {
        int sum = x - y;

        return sum;
    }

    public static int Multiplication(int x, int y) {
        int sum = x * y; 

        return sum;
    }

    public static int Division(int x, int y) {
        int sum = x / y;

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to my basic calculator!");
        System.out.println("What would you like to do today, add, divide, multiply or subtract two numbers?");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine().toLowerCase();

        int number1 = 0;
        int number2 = 0;

        if(choice.equals("add")) {

            System.out.println("What is the first number you would like to add?");
            number1 = sc.nextInt();
            System.out.println("What is the second number you would like to add?");
            number2 = sc.nextInt();

            System.out.println(number1 + " + " + number2 + " = " + Adding(number1, number2));

        } else if(choice.equals("subtract")) {

            System.out.println("What is the first number you would like to subtract?");
            number1 = sc.nextInt();
            System.out.println("What is the second number you would like to subtract?");
            number2 = sc.nextInt();

            System.out.println(number1 + " - " + number2 + " = " + Subtraction(number1, number2));

        } else if(choice.equals("divide")) {

            System.out.println("What is the first number you would like to divide?");
            number1 = sc.nextInt();
            System.out.println("What is the second number you would like to divide?");
            number2 = sc.nextInt();

            System.out.println(number1 + " / " + number2 + " = " + Division(number1, number2));

        } else if(choice.equals("multiply")) {

            System.out.println("What is the first number you would like to multiply?");
            number1 = sc.nextInt();
            System.out.println("What is the second number you would like to multiply?");
            number2 = sc.nextInt();

            System.out.println(number1 + " * " + number2 + " = " + Multiplication(number1, number2));

        } else {
            System.out.println("This is not yet a function!");
        }
        
    }
    
}
