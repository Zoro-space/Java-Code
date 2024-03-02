import java.util.Scanner;
//Count frequency of each element in an array
public class Frequency {
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

        boolean[] visited = new boolean[n]; // To track visited elements

        for (int i = 0; i < n; i++) {
            // Skip this element if it's already counted
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as visited
                    count++;
                }
            }
            System.out.println("Element: " + arr[i] + " | Frequency: " + count);
        }
    }
}
