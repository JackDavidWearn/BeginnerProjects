import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    
    // Users first name
    private String firstName;

    // Users last name
    private String lastName;

    // The Unique ID number of the user
    private String uuid;

    // The MD5 hash of the users pin
    private byte pinHash[];

    // The list of accounts for the user
    private ArrayList<Account> accounts;


    public User(String firstName, String lastName, String pin, Bank theBank) {

        this.firstName = firstName;
        this.lastName = lastName;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error caught, NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        this.uuid = theBank.getNewUserUUID();

        this.accounts = new ArrayList<Account>();

        System.out.printf("New User %s, %s with ID %s created.\n", lastName, firstName, this.uuid);
        
    }

    public void addAccount(Account anAccount) {
        this.accounts.add(anAccount);
    }

    public String getUUID() {
        return this.uuid;
    }

    public boolean validatePin(String aPin) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
        } catch(NoSuchAlgorithmException e) {
            System.err.println("Error caught, NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        return false;
        

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void printAccountsSummary() {

        System.out.printf("\n\n%s's accounts summary \n", this.firstName);

        for(int a = 0; a < this.accounts.size(); a++) {

            System.out.printf("%d) %s", a+1, this.accounts.get(a).getSummaryLine());

        }

        System.out.println();

    }

    public int numAccounts() {
        return this.accounts.size();
    }

    public void printAcctTransHistory(int acctIdx) {

        this.accounts.get(acctIdx).printTransHistory();

    } 

    public double getAccountBalance(int acctIdx) {
        return this.accounts.get(acctIdx).getBalance();
    }

    public String getAcctUUID(int acctIdx) {
        return this.accounts.get(acctIdx).getUUID();
    }

    public void addAcctTransaction(int acctIdx, double amount, String memo) {

        this.accounts.get(acctIdx).addTransaction(amount, memo);

    }
    
}
