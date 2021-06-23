import java.util.*;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 35 };
        int arr2[] = { 6, 9, 13, 15, 20, 29, 30, 35, 46 };

        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        Set<Integer> hash_set = new HashSet<Integer>();

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                hash_set.add(arr1[i]);
                i++;
            } else if (arr1[i] == arr2[j]) {
                hash_set.add(arr1[i]);
                i++;
                j++;
            } else {
                hash_set.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            hash_set.add(arr1[i]);
            i++;
        }
        while (j < m) {
            hash_set.add(arr2[j]);
            j++;
        }
        for (int num : hash_set) {
            list.add(num);
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k) + " ");
        }
    }
}
