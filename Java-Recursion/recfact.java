import java.util.*;

public class recfact {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sin.nextInt();
        int ans = fact(num);
        System.out.println("Factorial is:" + ans);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
