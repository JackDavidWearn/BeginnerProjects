import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating a new user
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Please enter your after tax income per month: ");
        double monthlyIncome = sc.nextDouble();

        User newUser = new User(firstName, lastName, monthlyIncome);




    }


    public static void printUserMenu(User theUser, Scanner sc) {

        int choice;

        do {
            System.out.printf("Welcome %s, what would you like to do? ", theUser.getFirstName());
            System.out.println("1) Show profit/loss");
            System.out.println("2) Add a expense");
            System.out.println("3) Quit");
            System.out.println();
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            if(choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please choose 1 - 3");
            }
        } while(choice < 1 || choice > 3);

        switch(choice) {

        case 1:
            Main.showProfitorLoss(theUser, sc);
            break;
        case 2:
            Main.addExpense(theUser, sc);
            break;
        }

        if(choice != 5) {

            System.exit(0);

        }

    }

    public static void showProfitorLoss(User theUser, Scanner sc) {

        

    }

    
    
}
