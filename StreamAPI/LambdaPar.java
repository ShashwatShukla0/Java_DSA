package StreamAPI;

interface Say{
    public String name(String fname);
}

public class LambdaPar {

    public static void main(String[] args){
        String abc = "Hello ";
        Say s = (fname) ->{   
            return abc+" World";
        };
        System.out.println(s.name(abc));
    }

    
    
}
