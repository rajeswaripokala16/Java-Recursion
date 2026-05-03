public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (arr.length - 1 == 0) {
            return -1;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, target, start, mid - 1);
            }
            return binarySearch(arr, target, mid + 1, end);
        }
        return 1; // Element not found
    }
}
