
public class OddEvenThread {


    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();

        for(int i=1; i<=10; i++){
            if(i%2==0)
                System.out.println(i);
        }

    }
}


class MyThread extends Thread{

    public void run(){

        for(int i=1; i<=10; i++)
            if(i%2!=0)
                System.out.println(i);

    }

}


