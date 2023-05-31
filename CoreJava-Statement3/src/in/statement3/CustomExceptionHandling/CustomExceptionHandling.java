package in.statement3.CustomExceptionHandling;

import java.util.Scanner;

public class CustomExceptionHandling {


    public static void main(String[] args) throws NegativeIntegerException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        int userInput = sc.nextInt();

        try {
            validate(userInput);
        }catch (NegativeIntegerException nie){
            System.out.println("Exception handled successfully");
            nie.printStackTrace();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    static void validate(int userInput) throws NegativeIntegerException {
        if(userInput<0){
            NegativeIntegerException nIE = new NegativeIntegerException("integer is negative");
            throw nIE;
        }
    }

}

class NegativeIntegerException extends Exception {

    public NegativeIntegerException(String str){
        super(str);
    }

}
