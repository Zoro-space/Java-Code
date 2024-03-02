
//import java.util.Arrays;

import java.util.Scanner;

//Find the minimum and maximum element in an array
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        sc.close();
        // Method-1
        // Arrays.sort(arr);
        // System.out.println("Minimum Element: " + arr[0]);
        // System.out.println("Maximum Element: " + arr[n - 1]);

        // Method-2 Time-O(n) Space O(1)
        // int min = arr[0];
        // int max = arr[0];
        // for (int i = 0; i < n; i++) {
        // if (arr[i] < min)
        // min = arr[i];
        // if (arr[i] > max)
        // max = arr[i];
        // }
        // System.out.println("Minimum Element: " + min);
        // System.out.println("Maximum Element: " + max);
        // Method-3
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);

    }

}
