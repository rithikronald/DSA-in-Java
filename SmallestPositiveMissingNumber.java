
public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int missing = findMissingNumber(arr, n);
        System.out.println(missing);
    }

    public static int findMissingNumber(int arr[], int n) {
        int seg = segregation(arr, n);
        return seg;
    }

    public static int segregation(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j += 1;
        }
        return j;
    }
}
