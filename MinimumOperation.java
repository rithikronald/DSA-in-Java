public class MinimumOperation {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 3, 1 };
        int n = arr.length;
        int val = arr[0];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                ;
            } else {
                count += 1;
                val = arr[i];
            }
        }
        System.out.println(count);
    }
}
