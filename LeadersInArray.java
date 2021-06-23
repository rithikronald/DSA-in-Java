import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<Integer>(n);
        int max = arr[n - 1];
        leaders.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }
        int size = leaders.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = leaders.get(i);
            leaders.set(i, leaders.get(size - 1));
            leaders.set(size - 1, temp);
        }
        for (int num : leaders) {
            System.out.println(num);
        }
    }
}
