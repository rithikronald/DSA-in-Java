package DSA;

public class SmallestNumber {
    public static void main(String[] args) {
        int n = 20;
        long j = 1L;
        for (int i = 1; i <= n; i++) {
            j = lcm(j, i);
        }
        System.out.println(j);
    }

    public static long lcm(long x, long y) {
        long gcd = gcd(x, y);
        long lcm = x * y / gcd;
        return lcm;
    }

    public static long gcd(long x, long y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}
