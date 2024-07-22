import java.util.Arrays;

// Second smallest and Second Largest Element
public class S {
    static void Second(int[] arr, int n) {
        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int sm = Integer.MAX_VALUE;  // Smallest element
        int Ssm = Integer.MAX_VALUE; // Second smallest element
        int lar = Integer.MIN_VALUE; // Largest element
        int Slar = Integer.MIN_VALUE; // Second largest element

        for (int i = 0; i < n; i++) {
            // Finding the smallest and second smallest elements
            if (arr[i] < sm) {
                Ssm = sm;
                sm = arr[i];
            } else if (arr[i] < Ssm && arr[i] != sm) {
                Ssm = arr[i];
            }

            // Finding the largest and second largest elements
            if (arr[i] > lar) {
                Slar = lar;
                lar = arr[i];
            } else if (arr[i] > Slar && arr[i] != lar) {
                Slar = arr[i];
            }
        }

        // Handle cases where there is no second smallest or second largest element
        if (Ssm == Integer.MAX_VALUE) {
            Ssm = -1;
        }
        if (Slar == Integer.MIN_VALUE) {
            Slar = -1;
        }

        System.out.println("Second Smallest: " + Ssm);
        System.out.println("Second Largest: " + Slar);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 75, 3, 7, 0, 78 };
        int n = arr.length;
        Second(arr, n);
    }
}

