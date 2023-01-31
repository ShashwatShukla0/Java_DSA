package InterviewQ;

public class Vovel {

    public static void main(String[] args) {
        String str1="Hello";
        String str2="bdf";

        System.out.println(Cvovel(str1));
        System.out.println(Cvovel(str2));
    }

    public static boolean Cvovel(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    
}
