public class SquareRoot {
    public static long binarysearch(long l, long r, long x) {
        long nxt = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (mid * mid == x)
                return mid;
            else if (mid * mid < x) {
                nxt = mid + 1;
                if (nxt * nxt > x)
                    return mid;
                else
                    l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long x = 6;
        long l = 0;
        long r = x;
        long res = binarysearch(l, r, x);
        System.out.println(res);
    }
}
