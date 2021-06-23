public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 5, 4 };
        int unique[] = new int[arr.length];
        unique[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == unique[j]) {
                    System.out.println(arr[i]);
                    break;
                } else {
                    unique[i] = arr[i];
                }
            }
        }
    }
}
