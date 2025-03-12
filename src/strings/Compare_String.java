package strings;

import java.util.Objects;

public class Compare_String {


    public static void main(String[] args){

        String s1 = "Java";
        String s2 = "Python";
        String s3 = "Java";
        String s4 ="java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.compareTo(s4));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1 ==s3);
        System.out.println(s1 ==s4);


    }
}
