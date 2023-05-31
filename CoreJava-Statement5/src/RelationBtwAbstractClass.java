
public abstract class RelationBtwAbstractClass {

    public RelationBtwAbstractClass(){
        System.out.println("constructer called");
    }

    abstract void run();

    abstract void sum();

    abstract void spilt();

    void disp(){
        System.out.println("Concrete method");
    }

}

abstract class AbstractClass extends RelationBtwAbstractClass{

    @Override
    public void run(){
        System.out.println("run method overide which is form other abstract class");
    }

}

class NormalClass extends AbstractClass{


    @Override
    void sum() {

    }

    @Override
    void spilt() {

    }
}