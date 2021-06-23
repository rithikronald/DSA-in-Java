import java.util.*;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 2, 4, 6, 7, 8 };
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (list.size() < 1) {
                    list.add(arr1[i]);
                } else if (list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            } else {
                if (j == m - 1) {
                    j = 0;
                    i++;
                } else {
                    j++;
                }
            }
        }
        System.out.println(list);
    }
}
