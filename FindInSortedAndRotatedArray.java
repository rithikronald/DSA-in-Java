public class FindInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr.length;
        int k = 10;
        System.out.println(search(arr, n, k));
    }

    public static int search(int array[], int n, int target) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[start] <= array[mid]) {
                if (array[start] <= target && target <= array[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (array[mid] <= target && target <= array[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}