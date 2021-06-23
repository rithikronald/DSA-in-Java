public class ArrayRotate {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void leftRotate(int arr[], int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        printArray(arr, n);
    }

    /* UTILITY FUNCTIONS */

    /* function to print an array */
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /* Fuction to get gcd of a and b */
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = { 23, 3, 3, 4, 5, 5, 1, 123, 2, 21, 4, 17, 785, 123, 367, 45, 85, 92, 44, 11, 24, 37, 95, 35, 6, 4,
                5, 1, 2, 7, 78, 3, 2, 48, 89, 12, 65, 32, 45, 2, 23, 1, 4, 5, 6, 1, 23, 5, };
        int n = arr.length;
        int d = n - 1;
        System.out.println(n + " " + d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        leftRotate(arr, d, n);

    }

}