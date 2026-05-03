import java.util.*;

/*
 * Approach:  
The idea is to recursively reduce the problem size in each call by one, until only one element is left (which is trivially the min or max). This forms a natural divide into smaller subproblems where each call trusts the previous recursive result and compares it with the current element.

Base Case:

If n == 1, return arr[0] since a single element is both the min and max in its range.

Recursive Call:

 If the base case is not met, then call the function by passing the array of one size less from the end

Call getMinRec(arr, n - 1) to find min in the subarray (from index 0 to n-2).
Call getMaxRec(arr, n - 1) similarly to find the max in the subarray.
Return Statement:

At each recursive call (except for the base case), return the minimum of the last element of the current array (i.e. arr[n-1]) and the element returned from the previous recursive call. 
 */
class findmaxminarra {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int n = arr.length;
        int min = getMinRec(arr, n);
        int max = getMaxRec(arr, n);
        System.out.println(min + " " + max);

    }

    public static int getMinRec(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], getMinRec(arr, n - 1));
    }

    public static int getMaxRec(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], getMaxRec(arr, n - 1));
    }
}