public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int x = 4;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (x == arr[mid]) {
                System.out.print(mid);
                break;
            } else if (x > mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }
}
