import java.util.Scanner;
import java.lang.StringBuilder;

public class reversestr {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sin.nextLine();
        String rev = stringrev(str);
        System.out.println("Reversed String:" + rev);
    }

    public static String stringrev(String s) {
        // if (s.isEmpty()) {
        // return s;
        // }
        // return stringrev(s.substring(1)) + s.charAt(0);
        if (s == null || s.isEmpty()) {
            return s;
        }
        // StringBuilder sb = new StringBuilder();
        return new StringBuilder(s).reverse().toString();
    }
}
