package InterviewQ;

public class MultiThreadRunn implements Runnable {

    public void run() {
        try {
            System.out.println("THread is running.....");
        } catch(Exception e) {
            System.out.println("Error !!");
        }
    }

    public static void main(String[] args) {
        MultiThreadRunn obj = new MultiThreadRunn();
        Thread o = new Thread(obj);
        o.start();
    }
    
}
