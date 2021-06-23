
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = { 74, -72, 94, -53, -59, -3, -66, 36, -13, 22, 73, 15, -52, 75 };
        int total_max = 0;
        int temp_max = 0;
        for (int i = 0; i < arr.length; i++) {
            temp_max += arr[i];
            if (total_max < temp_max) {
                total_max = temp_max;
            }
            if (temp_max < 0)
                temp_max = 0;
        }
        System.out.println(total_max);
    }
}
