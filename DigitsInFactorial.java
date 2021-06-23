public class DigitsInFactorial {
    public static void main(String[] args) {
        int N = 42;
        long fact = factorial(N);
        System.out.println(fact);
        // int count = 0;
        // while (fact != 0) {
        // fact = fact / 10;
        // count += 1;
        // }
        // System.out.println(count);

    }

    public static long factorial(int N) {
        long fact = 1L;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
}
