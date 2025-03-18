package programs.Medium;

public class RemoveDuplicatesinString {


public static void main(String[] args){
  String str = "jygjhgryyutrteqredsfd";
  String output ="";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
        if (!output.contains(String.valueOf(c))){
            output += String.valueOf(c);
        }
    }
        System.out.println(output);
}
}
