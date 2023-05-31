public interface RelationBetTwoInterface {

    void disp();

    void sum();


}

interface mInterface {

    void run();

    void start();

}

interface nInterface extends RelationBetTwoInterface, mInterface{

    void temp();        // interface can extend multiple interface
                        // but, can't extend single class

}

class SampleClass implements nInterface{


    @Override
    public void disp() {

    }

    @Override
    public void sum() {

    }

    @Override
    public void run() {

    }

    @Override
    public void start() {

    }

    @Override
    public void temp() {

    }
}

