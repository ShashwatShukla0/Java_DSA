package Multithreading;

import java.util.Scanner;

//volatility is used to prevent threads,caching variables when they are not changed from within that thread, use another variable

class Proccess extends Thread {

    private boolean running = true;

    public void run() {

        while(running){
            System.out.println("Hello");

            try {
                Thread.sleep(50);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}

public class ThreadSync {

    public static void main(String[] args) {

        Proccess p1 = new Proccess();
        p1.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        p1.shutdown();

        sc.close();
    }


    
}
