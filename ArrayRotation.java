
public class ArrayRotation {
    public static void main(String[] args) {
        int[] nums = { 40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45,
                20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4,
                20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25, };
        int d = 69;
        int n = nums.length;

        for (int i = 0; i < d / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[d - 1 - i];
            nums[d - i - 1] = temp;
        }

        for (int i = 0; i < (n - d) / 2; i++) {
            int temp = nums[i + d];
            nums[i + d] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}