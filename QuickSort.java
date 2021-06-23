public class QuickSort {
    public static void swap(int arr[], int a, int c) {
        int temp = arr[a];
        arr[a] = arr[c];
        arr[c] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = high;
        int pIndex = low;
        for (int i = low; i <= high; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, pivot);
        return pIndex;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 2, 7, 10, 1 };
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        quickSort(arr, low, high);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
