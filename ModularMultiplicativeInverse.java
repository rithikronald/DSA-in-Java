package DSA;

public class ModularMultiplicativeInverse {
    public static void main(String[] args) {
        int a = 3;
        int m = 11;
        int min = 1;
        int num = 0;
        for (int i = 2; i < m; i++) {
            int remainder = (i * a) % m;
            if (remainder != 0) {
                if (remainder <= min) {
                    min = remainder;
                    num = i;
                }
            }
        }
        System.out.println(num);
    }
}
