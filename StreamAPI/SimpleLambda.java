package StreamAPI;

public class SimpleLambda {

    interface Sum{
        public void sum();
    }
    //without lambda function
    public static void main(String args[]){

        int a=65,b=34;
        Sum s = new Sum(){
            public void sum(){
                System.out.println(a+b);
            }
        };

        s.sum();

        int add=a+b;
        //With lambda
        Sum s1 = () ->{
            System.out.println("SUM: "+ add);
        };
        s1.sum();
    }

    
    
}
