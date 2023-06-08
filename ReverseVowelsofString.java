public class ReverseVowelsofString {
    public static void main(String[] args) {
        String s = "helleCodErs";
        System.out.println("Reverse vowels in string:=> " + reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            char left = sb.charAt(i);
            char right = sb.charAt(j);
            if (isVowel(left) && isVowel(right)) {
                // swap/replace the characters
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            if (isVowel(left) == false) {
                i++;
            } else if (isVowel(right) == false) {
                j--;
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
