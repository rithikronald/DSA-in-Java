public class RotateMatrix {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // In efficient

        // int[][] temp = new int[n][n];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // temp[i][j] = arr[j][n - i - 1];
        // }
        // }

        // efficient

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = arr[i][j];

                arr[i][j] = arr[j][n - i - 1];

                arr[j][n - i - 1] = arr[n - i - 1][n - j - 1];

                arr[n - i - 1][n - j - 1] = arr[n - j - 1][i];

                arr[n - j - 1][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
