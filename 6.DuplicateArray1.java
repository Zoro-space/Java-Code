//Remove duplicates from unsorted array
public class DuplicateArray1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 7, 4, 8, 8, 7 };
        boolean[] arr1 = new boolean[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr1[j] = true;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
