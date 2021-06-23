import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 2);
        // map.put(0, map.get(0) + 1);
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
