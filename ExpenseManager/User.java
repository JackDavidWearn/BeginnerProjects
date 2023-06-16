public class User {
    
    // Inits
    private String firstName;
    private String lastName;
    private double monthlyIncome;

    public User(String firstName, String lastName, double monthlyIncome) {

        // Setting the values
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlyIncome = monthlyIncome;

        System.out.printf("Welcome!\nA new user has been created with the following details:\nFirst Name: %s, Last Name: %s, Monthly Income: £%.02f", firstName, lastName, monthlyIncome);

    }

    public String getFirstName() {
        return this.firstName;
    }



}
