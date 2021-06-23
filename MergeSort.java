public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 2, 5, 6 };
        int r = arr.length - 1;
        int l = 0;
        mergesort(arr, l, r);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int arr[], int l, int r, int mid) {
        int i, j, k;
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i += 1;
                k += 1;
            } else {
                arr[k] = R[j];
                j += 1;
                k += 1;
            }
        }
        while (i < n1) {
            arr[k] = L[i];
            i += 1;
            k += 1;
        }
        while (j < n2) {
            arr[k] = R[j];
            j += 1;
            k += 1;
        }
    }

    public static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            merge(arr, l, r, mid);
        }
    }
}
