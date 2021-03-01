package DSA.Pattern;

public class HollowSquare {
    public static void main(String[] args) {
        int n = 8;
        boolean isEmpty = false;
        for (int i = 0; i < n; i++) {
            if (i >= 1) {
                isEmpty = true;
            }
            if (i == n - 1) {
                isEmpty = false;
            }
            System.out.print("* ");
            for (int j = 0; j < n - 2; j++) {
                if (!isEmpty) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
