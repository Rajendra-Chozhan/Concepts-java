package programs.Basics;

public class RemoveSpace {

    public static void main(String [] args){

        String str= " Rajendra Chozhan G";

       str =  str.replaceAll(" ","");
        System.out.println(str);
    }
}
