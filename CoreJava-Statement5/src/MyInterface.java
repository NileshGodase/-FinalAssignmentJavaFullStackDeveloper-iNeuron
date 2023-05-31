
public interface MyInterface {

    // all methods of interface are public abstract by default

    void method1();     // public abstract void method1();

    void method2();

    void method3();

    void method4();

}


abstract class MyAbstractClass implements MyInterface {

    public MyAbstractClass(){
        System.out.println("Abstract class constructor");
    }

    @Override
    public void method1(){
        System.out.println("Given the implementation to method1() of interface");
    }

    public abstract void method5();

}


class MyNormalClass extends MyAbstractClass{


    @Override
    public void method2() {
        System.out.println("imple for method which is inherited from interface to abstract class");
    }

    @Override
    public void method3() {
        System.out.println("imple for method which is inherited from interface to abstract class");
    }

    @Override
    public void method4() {
        System.out.println("imple for method which is inherited from interface to abstract class");
    }

    @Override
    public void method5() {
        System.out.println("imple for method which is inherited from interface to abstract class");
    }
}


