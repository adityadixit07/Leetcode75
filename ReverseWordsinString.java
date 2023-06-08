import java.util.Stack;

public class ReverseWordsinString {
    public static void main(String[] args) {
        String s="Leetcode 75 days challenge";
        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s){
        String res="";
        Stack<Character> st=new Stack<>();
        int i=0;
        boolean space=false;
        while(i<s.length()){
            if(s.charAt(i)!=' '){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==' '){
                while(st.size()>0){
                    res=st.pop()+res;
                    space=true;
                }
                if(space==true){
                    res=" "+res;
                    space=false;
                }
            }
            i++;
        }
        while(st.size()>0){
            res=st.pop()+res;
        }
        if(res.charAt(0)==' '){
            return res.substring(1,res.length());
        }
        return res;
    }
}
