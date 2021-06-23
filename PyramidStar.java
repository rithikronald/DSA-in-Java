package DSA.Pattern;

public class PyramidStar {
    public static void main(String[] args) {
        int n = 9;
        int c = n;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < c; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            c--;
        }
    }
}
