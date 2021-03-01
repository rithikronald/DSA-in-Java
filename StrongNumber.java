package DSA;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 147;
        int n = num;
        int sum = 0;
        while (n != 0) {
            sum = sum + fact(n % 10);
            // System.out.println(sum);
            n = n / 10;
        }
        if (sum == num) {
            System.out.print("is a strong number");
        } else {
            System.out.print(" is not a strong number");
        }
    }

    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
