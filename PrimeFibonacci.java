public class PrimeFibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            if (prime(sum))
                System.out.print(sum + " ");
        }
    }

    public static Boolean prime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
