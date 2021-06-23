public class SmallestDigitNumber {
    public static int Solution(int n) {
        int j = 1;
        int sum = 0;
        int product = 1;
        if (n == 1)
            return 1;
        while ((int) Math.log(j) < n + 1) {
            while (j != 0) {
                int mod = j % 10;
                sum += mod;
                product *= mod;
                if (product >= sum)
                    return j;
                j = j / 10;
            }
            j += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 123;
        int res = Solution(n);
        System.out.println(res);
    }
}
