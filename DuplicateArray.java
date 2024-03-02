import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Remove duplicates from a sorted array
public class DuplicateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int[] arr1 = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr1[j++] = arr[i];

            }
        }
        arr1[j++] = arr[n - 1];
        for (int k = 0; k < arr1.length; k++) {
            System.out.println("New Array:" + arr1[k]);
        }

    }
}
