package InterviewQ;

public class MultriThread extends Thread {

        public void run() {
            try{
                System.out.println("THread is running");
            } catch ( Exception e) {
                System.out.println("Error !!");
            }
        }

        public static void main(String[] args) {
            MultriThread obj = new MultriThread();
            obj.start();
        }
}
