package StreamAPI;

@FunctionalInterface
interface GenericInterface<T>{

    //generic method
    T func(T t);
}

public class GenericInt {
    
    public static void main(String args[]){
        
        //declare reference to generic type
        //assign lambda exp to it

        GenericInterface<String> rev = (str) ->{
            String res = "";
            for(int i=str.length()-1;i>=0;i--){
                res += str.charAt(i);
            }
            return res;
        };

        System.out.println("LAMBDA reversed: "+ rev.func("lambda"));


        //declare another reference of type int

        GenericInterface<Integer> multiply = (sum) ->{
            int mult = 1;
            for(int i=1;i<5;i++){
                mult = sum*i;
            }
            return mult;
        };

        System.out.println("Multiplication in loop : "+ multiply.func(5));
    }

}
