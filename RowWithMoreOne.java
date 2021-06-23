
public class RowWithMoreOne {
    public static void main(String[] args) {
        int mat[][] = { { 0, 1, 1, 1 }, { 0, 0, 0, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
        int n = mat.length;
        int m = mat[0].length;
        int curr_count = 0;
        int max_count = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    curr_count++;
                }
            }
            if (max_count < curr_count) {
                max_count = curr_count;
                index = i;
            }
            curr_count = 0;
        }
        System.out.println((10 ^ 7));
    }
}
