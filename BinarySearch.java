import java.util.Arrays;

public class BinarySearch {
    static void Search(int[] arr, int k) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        // Assuming the array is already sorted. If not, uncomment the next line.
        // Arrays.sort(arr);

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else { // arr[mid] == k
                ans = mid;
                break;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 4;
        Search(arr, k); // Output should be the index of 4, which is 3
    }
}
