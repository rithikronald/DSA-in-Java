package DSA.Pattern;

public class RhombusStar {
    public static void main(String[] args) {
        int n = 5;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < c; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {

                System.out.print("* ");
            }
            System.out.println();
            c++;
        }
    }
}
