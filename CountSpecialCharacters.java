
public class CountSpecialCharacters {
    public static void main(String[] args) {
        String str = "aeiou";
        int vowels_count = 0;
        int space_count = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            // Vowels count
            if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u') {
                vowels_count++;
            }
        }
        System.out.println(vowels_count);
    }
}
