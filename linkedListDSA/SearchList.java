package linkedListDSA;

import java.util.LinkedList;

public class SearchList {

    public static void main(String args[]) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(60);
        l1.add(40);
        l1.add(25);
        l1.add(75);
        l1.add(90);
        l1.add(50);

        int key=75;
        int ans=-1,ele;

        for(int i=0;i<l1.size();i++){
            ele=l1.get(i);
            if(ele==key){
                ans=i;
                break;
            }
        }

        if(ans==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at: "+ans);
        }

    }
    
}
