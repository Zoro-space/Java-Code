import java.util.Scanner;
//Rearrange array in increasing-decreasing order
public class rearrange {
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

        // Sort the array in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Array element:");
        // Rearrange the array in increasing-decreasing order
        for (int i = 0; i < n / 2; i++) {
            System.out.println(arr[i]); // Print the first half in ascending order
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.println(arr[i]); // Print the second half in descending order
        }
    }
}
