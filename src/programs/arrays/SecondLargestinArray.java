package programs.arrays;

public class SecondLargestinArray {


    public static void main(String[] args) {

        int [] a = {12, 10, 7, 75, 56};

        int first = 0;
        int second = 0;

        for (int i=0;i<a.length;i++){
            if(a[i]>first){
                second = first;
                first = a[i];
            }else if(a[i]>second){
                second = a[i];
            }
        }
        System.out.println("Second largest element in array is: "+second);
    }
}
