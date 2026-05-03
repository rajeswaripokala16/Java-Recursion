
import java.util.*;

public class evensum {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sin.nextInt();
        int sum = 0;
        int ans = evensum(n, sum);
        System.out.println(ans);
    }

    public static int evensum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        if (n % 2 == 0) {
            sum += n;
        }
        return evensum(n - 1, sum);
    }
}
