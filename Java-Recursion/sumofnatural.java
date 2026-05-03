import java.util.*;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int sum = 0;
        int ans = nat(n, sum);
        System.out.println(ans);

    }

    public static int nat(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += n;
        return nat(n - 1, sum);

    }
}
