package InterviewQ;

public class LSearch {

    public static void main(String[] args) {

        int arr[] = {3,6,2,87,43,23,65,98,8,65,6};
        int size = arr.length;

        int key =22;
        int count =0;

        for(int i=0;i<size;i++) {
            if(key == arr[i]){
                count =1; }

        }
        if(count ==1) {
            System.out.println("Found the element ");
        } else {
            System.out.println("No Such element");
        }
    }
    
}
