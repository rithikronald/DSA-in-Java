public class WPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            for (int o = n - 1; o > i; o--) {
                System.out.print(" ");
            }
            for (int p = 0; p < i + 1; p++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}