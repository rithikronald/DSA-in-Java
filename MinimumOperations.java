import java.io.IOException;

public class MinimumOperations {

    public static int minOp(int n, int[] arr) {
        int prevVal, ops = 0;
        if (n <= 0) {
            return -1;
        }
        prevVal = arr[0];
        ops++;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] != prevVal) {
                ops++;
            }
            prevVal = arr[i];
        }
        System.out.println(ops);
        return ops;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = new int[] { 3, 4, 8, 8, 9, 5, 5, 1, 2, 2, 1, 10, 10, 1, 1, 14, 14, 7, 7, 7, 7, 18, 19, 19, 8, 8, 9,
                2, 2, 1, 10, 10, 1, 1, 14, 5, 5, 1, 2, 2, 1, 10, 10, 1, 1, 14, 14, 7, 7, 7, 4, 8, 8, 5, 5, 1, 2, 2,
                1, };
        int n = arr.length;
        System.out.println(n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        minOp(n, arr);
    }
}