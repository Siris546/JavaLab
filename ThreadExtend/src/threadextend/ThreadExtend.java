
package threadextend;

public class ThreadExtend extends Thread {
    public void run(){
        System.out.println("Thread is running .....");
    }
    public static void main(String[] args) {
        ThreadExtend t1 = new ThreadExtend();
        t1.start();
        ThreadExtend t2 = new ThreadExtend();
        t2.start();
    }
}
