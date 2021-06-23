package DSA.Pattern;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 9;
        int c = n;
        for (int i = 0; i < n; i++) {
            for (int j = c; j > 0; j--) {
                System.out.print("* ");
            }
            c--;
            System.out.println();
        }
    }
}
