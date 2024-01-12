
package threadsexample;

public class ThreadsExample implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        
        ThreadsExample t1=new ThreadsExample();
        Thread T=new Thread(t1);
        T.start();  
        ThreadsExample t2=new ThreadsExample();
        Thread T1=new Thread(t2);
        T1.start();
        ThreadsExample t3=new ThreadsExample();
        Thread T2=new Thread(t3);
        T2.start();
    }
}
