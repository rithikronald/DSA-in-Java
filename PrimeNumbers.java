//  Sieve of Eratosthenes Algorithm
public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 10;
        boolean[] numList = new boolean[n];
        int[] primeNumbers = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            numList[i] = true;
        }
        for (int i = 2; i <= n - 1; i++) {
            for (int j = i * i; j <= n - 1; j++) {
                if (j % i == 0) {
                    numList[j] = false;
                }
            }
            if (numList[i] == true) {
                primeNumbers[i - 2] = i;
            }

        }
        for (int num : primeNumbers) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
