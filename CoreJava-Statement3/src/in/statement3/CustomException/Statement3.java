package in.statement3.CustomException;

import  java.util.*;

public class Statement3 {


    public static void main(String[] args) throws NegativeIntegerException{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        int userInput = sc.nextInt();
        validate(userInput);


    }

    static void validate(int userInput) throws NegativeIntegerException{
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
