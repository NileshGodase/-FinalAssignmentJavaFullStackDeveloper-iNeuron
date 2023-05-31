import  java.util.*;


class Parent{

    public Parent(){
        System.out.println("Parent class constructor");
    }

}


class Child extends Parent{

    /**
     *    even if we don't code constructor logic in a class,
     *    automatically zero-parameterised constructor will be called with the first line of code body of
     *    constructor is super() method which will call the parent class constructor.
     *
     **/

}


public class Statement2 {

    public static void main(String[] args) {
        Child child = new Child();          // o/p -- Parent class constructor
    }

}

