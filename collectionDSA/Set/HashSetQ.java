package collectionDSA.Set;

import java.util.Arrays;
import java.util.HashSet;

class HashSetQ {

    public static void main(String[] args) {

        Integer A[] = {33,44,55,66,77,99};
        Integer B[] = {55,2,66,88,12,77};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(A));
        set2.addAll(Arrays.asList(B));

        System.out.println(set1);
        System.out.println(set2);

        System.out.println("Union:");
        HashSet<Integer> uni = new HashSet<>(set1);
        uni.addAll(set2);
        System.out.println(uni);

        System.out.println("Inter:");
        HashSet<Integer> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        System.out.println(inter);

        System.out.println("Diff: ");
        HashSet<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println(diff);


        System.out.println("HashCode");
        System.out.println(set1.hashCode());
    } }
