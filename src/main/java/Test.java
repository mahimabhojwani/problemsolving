class A extends Thread{
    public void run(){
        System.out.println("Thread A is running...");
    }
}

class B implements Runnable{

    public void run() {
        System.out.println("Thread B is running...");
    }
}

public class Test {

    public static void main(String ... s){
        System.out.println("Hi");
        A a = new A();
        a.start();

        Thread t1 = new Thread(new B());
        t1.start();
    }
}
