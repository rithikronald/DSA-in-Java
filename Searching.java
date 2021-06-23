public class Searching {
    public static void main(String[] args) {
        int n = 3;
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int x = 5;
        int i = 0, j = n - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                System.out.print(i + " " + j);
            } else if (arr[i][j] > x) {
                j--;
            } else
                i++;
        }
    }
}
