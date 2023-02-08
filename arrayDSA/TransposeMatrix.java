package arrayDSA;

public class TransposeMatrix {

    public static void main(String args[]) {

        int org[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int trans[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                trans[i][j] = org[j][i];
            }
        }
        System.out.println("Before Transponse: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(org[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transponse: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(trans[i][j]+" ");
            }
                System.out.println();
        }

    }
    
}
