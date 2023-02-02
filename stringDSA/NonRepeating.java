package stringDSA;

public class NonRepeating {

    public static void main(String args[]) {

        String str="Geekforgeek";
        

        int idx=-1;
        char fnx=' ';

        for(char i:str.toCharArray()) {
            if(str.indexOf(i)==str.lastIndexOf(i)) {

                fnx = i;
                break;
            }
            else
            {
                idx+=1;
            }
        }

        if(idx==1){
            System.out.println("STring is not repeateing");
        } else{
            System.out.println("repeating char: "+ fnx);
        }

    }
    
}
