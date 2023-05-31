import java.util.ArrayList;
import java.util.Scanner;

public class MyBank {

    static ArrayList<String> username = new ArrayList<>();
    static ArrayList<Integer> balance = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){

            service();

        }

    }

    private static void service(){

        System.out.println("Choose the below services using corresponding number");
        System.out.println("For Create Account   -- 1");
        System.out.println("For Balance Inquiry  -- 2");
        System.out.println("For Deposite money   -- 3");
        System.out.println("For Withdraw Money   -- 4");

        int userInput = sc.nextInt();

        switch (userInput){

            case 1 :
                addUser();
                break;

            case 2 :
                checkBalance();
                break;

            case 3 :
                deposite();
                break;

            case 4 :
                withdraw();
                break;

            default:
                System.out.println("Please provide valid input");

        }

    }

    private static void deposit(int index){

        System.out.println("Enter the amount to be deposite");
        Integer deposite = sc.nextInt();

        balance.add(index, balance.get(index)+deposite);


    }

    private static void addUser() {
        System.out.println("Enter your username");
        String user = sc.next();

        if(username.indexOf(user)==-1){
            username.add(user);

            System.out.println("Enter the amount to be deposite");
            Integer deposite = sc.nextInt();

            balance.add(username.indexOf(user), deposite);

            System.out.println("\n\n\n");

        }else{
            System.out.println("Entered username is already exit in the system" +
                    "\nplease use another username\n");
            System.out.println("\n\n\n");
            addUser();
        }

    }

    private static void checkBalance(){

        System.out.println("Enter your username");
        String user = sc.next();
        if(username.indexOf(user)!=-1) {
            System.out.println("Your balance is " + balance.get(username.indexOf(user)));
            System.out.println("\n\n\n");
        }
        else{
            System.out.println("Account doesnt exit with this username");
            System.out.println("\n\n\n");
        }
    }

    private static void deposite(){

        System.out.println("Enter your username");
        String user = sc.next();

        if(username.indexOf(user)!=-1) {
            deposit(username.indexOf(user));
            System.out.println("\n\n\n");
        }
        else {
            System.out.println("Account doesnt exit with this username");
            System.out.println("\n\n\n");
        }

    }

    private static void withdraw(){

        System.out.println("Enter your username");
        String user = sc.next();

        if(username.indexOf(user)!=-1){

            System.out.println("Enter the amount to be withdraw");
            Integer withdrawAmt = sc.nextInt();

            balance.add(username.indexOf(user),balance.get(username.indexOf(user))-withdrawAmt);

            System.out.println("Amount Withdraw = "+withdrawAmt);
            System.out.println("Balance remain in account is "+balance.get(username.indexOf(user)));
            System.out.println("\n\n\n");

        }
        else {
            System.out.println("Account doesnt exit with this username");
            System.out.println("\n\n\n");
        }


    }

}
