public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 2, 5, 6 };
        int n = arr.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
