package programs.Medium;

import java.util.Arrays;

public class PushZerosArray {

    private static int []pushzerostoend(int [] a){
        if (a.length ==1){
            return a;
        }

        int[] newarr = new int[a.length];
        int count = 0;
        for (int number : a){
                if (number!=0){
                    newarr[count] = number;
                    count++;
                }
            }
return newarr;

    }
    public static void main(String[] args){
       int [] i =new int[] {1,0,3,0,0,2,2,2,2,0};
System.out.println(Arrays.toString( pushzerostoend(i)));


         i =new int[] {0,0,9,0,9,0,2,2,2,2,0};
        System.out.println(Arrays.toString( pushzerostoend(i)));

}}
