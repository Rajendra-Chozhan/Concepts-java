package programs.Basics;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {

        int n;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number for check");
        n =x.nextInt();
        int count = 0;

        for (int i=1;i<=n;i++){
            if (n%i==0) {
                count++;

            }}
        if (count == 2){
            System.out.println("The entered number " + n +" is prime number");
        }
        else {
            System.out.println("The entered number " + n +" is not prime number");
        }

    }}



