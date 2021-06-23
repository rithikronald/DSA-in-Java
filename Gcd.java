
public class Gcd {
    public static void main(String[] args) {
        int n = 3;
        int j = n + 1;
        int res = finder(n, j);
        System.out.println(res);
    }

    public static int finder(int n, int j) {
        int i = 1;
        while (i <= n) {
            if (j % i == 0) {
                i = i + 1;
            } else {
                finder(n, j + 1);
            }
        }
        return j;
    }
}
