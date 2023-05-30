package Practise;

public class StringDiff {

    static void StrCon(String str){
        str = str+" ABC";
    }

    static void StrBufCon(StringBuffer str) {
        str.append("ABC");
    }

    static void StrBuiCon(StringBuilder str) {
        str.append("ABCC");
    }

    public static void main(String[] args) {

        String str1 = "Hello";
        StrCon(str1);
        System.out.println("String: "+ str1);

        StringBuffer str2 = new StringBuffer("HelloQ");
        StrBufCon(str2);
        System.out.println("String buffer: "+str2);

        StringBuilder str3 = new StringBuilder("Hello!!");
        StrBuiCon(str3);
        System.out.println("String Builder: "+str3);



    }
    
}
