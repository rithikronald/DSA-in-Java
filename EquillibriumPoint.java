
public class EquillibriumPoint {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = { 1, 2, 3, 2, 1 };
        int sumLeft = 0;
        // int sumRight = 0;
        int sum = 0;
        // solution #1

        // for (int i = 0; i < n; ++i) {
        // for (int j = 0; j < i; j++) {
        // sumLeft += arr[j];
        // }
        // for (int j = i + 1; j < n; j++) {
        // sumRight += arr[j];
        // }
        // if (sumLeft == sumRight) {
        // System.out.println(i);
        // }
        // }

        // solution #2

        for (int num : arr) {
            sum += num;
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (sum == sumLeft)
                System.out.println(i);
            sumLeft += arr[i];

        }
        System.out.println("-1");
    }
}
