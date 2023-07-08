public class maxVowelsinKsize {
    public static void main(String[] args) {
        String s="abcdeefjklee";
        int k=3;
        System.out.println(maxSubstringLength(s,k));
    }

    public static int maxSubstringLength(String s,int k){
        int max=Integer.MIN_VALUE;
        int count=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char c=s.charAt(j);
            // if window size k=1
            if(k==1 && isVowel(c)){
                return 1;
            }
            if(isVowel(c)){
                count++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,count);
                char ithChar=s.charAt(i);
                if(isVowel(ithChar)){
                    count--;
                }
                i++;
                j++;
            }
        }
        return max;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
