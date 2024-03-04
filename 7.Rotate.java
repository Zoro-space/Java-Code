package ASS;

import java.util.Scanner;

// Rotate array by K elements - Reversal Algorithm
public class Rotate {
    public void rotate(int[] nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number of positions to rotate the array:");
        int k = sc.nextInt();

        Rotate rotator = new Rotate();
        rotator.rotate(nums, k);

        System.out.println("Array after rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
