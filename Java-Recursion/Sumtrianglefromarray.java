import java.util.Arrays;

public class Sumtrianglefromarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sumTriangle(arr);
        // int ans = sumTriangle(arr);
        // System.out.println("Sum of triangle: " + ans);
    }

    public static void sumTriangle(int[] arr) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        int[] newarr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            newarr[i] = x;
        }
        sumTriangle(newarr);
        System.out.println(Arrays.toString(newarr));

    }
}
