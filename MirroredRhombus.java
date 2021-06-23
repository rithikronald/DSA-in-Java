package DSA.Pattern;

public class MirroredRhombus {
    public static void main(String[] args) {
        int n = 5;
        int c = n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = c; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {

                System.out.print("* ");
            }
            System.out.println();
            c--;
        }
    }
}
