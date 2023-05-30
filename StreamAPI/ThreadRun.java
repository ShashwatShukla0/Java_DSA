package StreamAPI;

class RunnableDemo implements Runnable {

    private Thread t;
    private String name;

    RunnableDemo(String name) {
        this.name = name;
        System.out.println("Creating: "+name);
    }

    public void run(){
        System.out.println("RUnning: "+name);

        try {

            for(int i=4;i>=0;i--){
                System.out.println("Thread: "+ t+" , "+i);

                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread: "+ t+" Interrupted");
        }

        System.out.println("Thread: "+t+" Exiting");
    }

    public void start() {
        System.out.println("Starting: "+ t);

        if(t==null) {
            t = new Thread(this,name);
            t.start();
        }
    }
    
}

public class ThreadRun {

    public static void main(String[] args) {

        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();
    }

}
