
public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = { 135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103,
                154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134 };
        int num = 468;
        int n = arr.length;
        int start = 0;
        int end = start;
        int sum = 0;
        while (start < n && end <= n) {
            if (sum > num) {
                start++;
                sum = 0;
                end = start;
            } else if (sum == num) {
                System.out.println(start + " " + (end - 1));
                break;
            }
            sum += arr[end];
            end++;
        }
        if (start == n - 1 || end == n) {
            System.out.println("-1");
        }
    }
}
