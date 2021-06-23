public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 13, 12, 2, 10, 5, 1 };
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n - 1) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j = j + 1;
            }
            j = 0;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
