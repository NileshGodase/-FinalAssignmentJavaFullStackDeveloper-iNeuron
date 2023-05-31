import  java.util.*;

interface Shape{



    public abstract void areaOfShape();
    public abstract void perimeterOfShape();

}

class Circle implements Shape
{


    Scanner sc = new Scanner(System.in);

    @Override
    public void areaOfShape(){
        System.out.println("Enter the radius of Circle");
        double radius = sc.nextFloat();
        double areaOfCircle = 3.14*radius*radius;
        System.out.println("Area of Circle is " + areaOfCircle);
    }

    @Override
    public void perimeterOfShape(){
        System.out.println("Enter the radius of Circle");
        double radius = sc.nextFloat();
        double perimeterOfCircle = 2*3.14*radius;
        System.out.println("Perimeter of Circle is " + perimeterOfCircle);
    }

}


class Rectangle implements Shape
{

    double length, breadth;
    Scanner sc = new Scanner(System.in);

    @Override
    public void areaOfShape(){
        System.out.println("Enter the length of Rectangle");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle");
        breadth = sc.nextFloat();
        double areaOfRectangle = length*breadth;
        System.out.println("Area of Rectangle is " + areaOfRectangle);
    }

    @Override
    public void perimeterOfShape(){
        System.out.println("Enter the length of Rectangle");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle");
        breadth = sc.nextFloat();
        double perimeterOfRectangle = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle is " + perimeterOfRectangle);
    }

}


class Triangle implements Shape
{

    Scanner sc = new Scanner(System.in);

    @Override
    public void areaOfShape(){
        System.out.println("Enter the length of base of Triangle");
        float base = sc.nextFloat();
        System.out.println("Enter the height of a Triangle");
        float height = sc.nextFloat();
        float areaOfTriangle = (base*height)/2;
        System.out.println("Area of Triangle is " + areaOfTriangle);
    }

    @Override
    public void perimeterOfShape(){
        System.out.println("Enter the length of 1st side of Triangle");
        double side1 = sc.nextFloat();
        System.out.println("Enter the length of 2nd side of Triangle");
        double side2 = sc.nextFloat();
        System.out.println("Enter the length of 3rd side of Triangle");
        double side3 = sc.nextFloat();
        double perimeterOfTriangle = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle is " + perimeterOfTriangle);
    }

}




public class Statement1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Shape from below by giving String input ");
        System.out.println("Circle, Rectangle, Triangle (case-insensitive)");
        String userInput = sc.next();

        if(userInput.equalsIgnoreCase("circle")){

            System.out.println("For calculating area of circle enter 1 \nFor calculating perimeter of circle enter 2 ");
            byte operationNumber;
            operationNumber = sc.nextByte();

            if(operationNumber==1){
                Shape myShape = new Circle();
                myShape.areaOfShape();
            }else if(operationNumber==2){
                Shape myShape = new Circle();
                myShape.perimeterOfShape();
            }else{
                System.out.println("Invalid input");
            }

        }

        else if(userInput.equalsIgnoreCase("rectangle")){

            System.out.println("For calculating area of rectangle enter 1 \nFor calculating perimeter of rectangle enter 2 ");
            byte operationNumber;
            operationNumber = sc.nextByte();

            if(operationNumber==1){
                Shape myShape = new Rectangle();
                myShape.areaOfShape();
            }else if(operationNumber==2){
                Shape myShape = new Rectangle();
                myShape.perimeterOfShape();
            }else{
                System.out.println("Invalid input");
            }

        }

        else if(userInput.equalsIgnoreCase("Triangle")){

            System.out.println("For calculating area of Triangle enter 1 \nFor calculating perimeter of Triangle enter 2 ");
            byte operationNumber;
            operationNumber = sc.nextByte();

            if(operationNumber==1){
                Shape myShape = new Triangle();
                myShape.areaOfShape();
            }else if(operationNumber==2){
                Shape myShape = new Triangle();
                myShape.perimeterOfShape();
            }else{
                System.out.println("Invalid input");
            }

        }

        else{
            System.out.println("Please provide valid input");
        }

    }

}
