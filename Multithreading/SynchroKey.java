package Multithreading;

public class SynchroKey {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }
    
    public static void main(String[] args) {

        SynchroKey app = new SynchroKey();
        app.doWork();
    }

    public void doWork(){
        Thread t1 = new Thread(new Runnable() {           //Creating thread using anonymus class
            public void run() {
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run(){
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();     //join provides t1 to wait till t2 completes execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: "+ count);
    }
}
