import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[2];
        for (int i = 0; i < 2; i++) {
            n[i] = sc.nextInt();
        }
        int A[] = new int[n[0]];
        int C[] = new int[n[1]];
        for (int i = 0; i < n[0]; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n[1]; i++) {
            C[i] = sc.nextInt();
        }
        int count = 0;

        int n1 = n[0];
        int n2 = n[1];

        int c1 = 0;
        int c2 = 0;

        int start = A[n1 - 1];
        int end = C[n2 - 1];

        for (int i = start; i < end; i++) {
            for (int j = 0; j < n1; j++) {
                if (i % A[j] == 0) {
                    c1 += 1;
                }
            }
            for (int k = 0; k < n2; k++) {
                if (C[k] % i == 0) {
                    c2 += 1;
                }
            }
            if (c1 == n1 && c2 == n2) {
                count += 1;
            }
            c1 = 0;
            c2 = 0;
        }
        System.out.print(count);
    }
}
