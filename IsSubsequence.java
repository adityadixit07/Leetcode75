
public class IsSubsequence {
    public static void main(String[] args) {
        String s="abc";
        String t="abdefc";
        // s is present in t after excluding some charater of t so it is subsequence of s;
        System.out.println(subsequence(s, t));
    }
    public static boolean subsequence(String s,String t){
        int i=0;
        int j=0;
        while(j<t.length()){
            if(i==s.length()) break;
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;

    }

}
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).