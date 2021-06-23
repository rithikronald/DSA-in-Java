public class MissingAndRepeating {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, 5 };
        int n = arr.length;
        int missing = 0, repeating = 0;
        for (int i = 0; i < n; i++) {
            int temp = arr[Math.abs(arr[i]) - 1];
            if (temp < 0) {
                repeating = Math.abs(arr[i]);
                break;
            }
            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
            }
        }
        System.out.print(repeating + " " + missing);

    }
}
