public class gcdOfStrings {
    public static void main(String[] args) {
        String s1="abcabcabc";
        String s2="abc";
        System.out.println("GCD of two strings:"+gcdStrings(s1, s2));
    }
    public static String gcdStrings(String s1,String s2){
        if(s2.length()>s1.length()){
            return gcdStrings(s2, s1);
        }
        if(s1.equals(s2)){
            return s1;
        }
        if(s1.startsWith(s2)){
            return gcdStrings(s1.substring(s2.length()), s2);
        }
        return "";
    }

}

// For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.