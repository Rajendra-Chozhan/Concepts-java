package operators;

public class Equals {

    public static void main(String[] args) {

        String a = "Selenium";
        String b = new String("Selenium");

        System.out.println(a == b);        // false (different memory locations)
        System.out.println(a.equals(b));   // true (same content)

    }
}
