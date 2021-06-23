public class FrequencyOfNumber {
    public static void main(String[] args) {
        String dummy = "aAcca";
        char to_find = 'a';
        int count = 0;
        for (int i = 0; i < dummy.length(); i++) {
            char val = Character.toLowerCase(dummy.charAt(i));
            if (val == Character.toLowerCase(to_find)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
