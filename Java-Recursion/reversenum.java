import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        Scanner sin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sin.nextInt();
        int ans = revnum(num);
        System.out.println(ans);

    }

    public static int revnum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + revnum(n / 10);
    }

}
