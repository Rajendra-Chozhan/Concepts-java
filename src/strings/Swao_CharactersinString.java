package strings;

import java.util.Scanner;

public class Swao_CharactersinString {


private static String swapCharacters(String inputString) {

    //5
    int length = inputString.length();
    


    //6
    if (length <= 1) {
        return inputString;
    } else {
        //7
        return inputString.charAt(length - 1) + inputString.substring(1, length-1) + inputString.charAt(0);}
    }
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        //2
        System.out.println("Enter a string : ");

        //3
        String userInput = scanner.next();

        //8
        System.out.println("Output String : " + swapCharacters(userInput));

    }}	
	
	

	

