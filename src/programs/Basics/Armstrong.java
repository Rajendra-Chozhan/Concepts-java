package programs.Basics;

public class Armstrong {
    public static void main(String[] args) {

        int n = 153;

    String number = Integer.toString(n);

    int length = number.length();
    long output = 0;
    char[] c = number.toCharArray();
        for (char i : c)
    output+= Math.pow(i - '0', length);

        System.out.println(output);
        if (n == output){
            System.out.println("The given number:"+ n +" is Armstrong number");
        }
else{
            System.out.println("The given number:"+ n +" is not Armstrong number");
        }        //output == n ? "True" : "False";

}}
