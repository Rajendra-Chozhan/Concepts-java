package programs.arrays;

public class LargestinArray {

    public static void main(String[] args) {

        int [] a = {12, 10, 7, 75, 56};

    int length = a.length;
    int max= a[0];
    for (int i=1;i<length;i++){
        if(a[i]>max)
            max = a[i];
        }
    System.out.println("Largest element in array is: "+max);
    }
}
