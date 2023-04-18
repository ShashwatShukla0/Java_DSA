package PrepInsta_Coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactorOfN {

    public static void main(String[] args){

        int n = 21;
        List<Integer> l1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                l1.add(i);
            }
        }
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
