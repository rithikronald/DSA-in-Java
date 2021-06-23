public class Zample {
    public static void main(String[] args) {
        int count[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ++count[i];
        }
        for (int num : count) {
            System.out.print(num + " ");
        }
    }
}
