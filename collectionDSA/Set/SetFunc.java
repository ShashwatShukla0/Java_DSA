package collectionDSA.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetFunc {

    public static void main(String[] args) {

        Integer A[] = {33,44,55,66,77,99};
        Integer B[] = {55,2,66,88,12,77};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(A));
        set2.addAll(Arrays.asList(B));

        System.out.println(set1);
        System.out.println(set2);

        System.out.println("Union:");
        Set<Integer> uni = new HashSet<>(set1);
        uni.addAll(set2);
        System.out.println(uni);

        System.out.println("Inter:");
        Set<Integer> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        System.out.println(inter);

        System.out.println("Diff: ");
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println(diff);


        System.out.println("HashCode");
        System.out.println(set1.hashCode());
    }
    
}
