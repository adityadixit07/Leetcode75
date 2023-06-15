import java.util.Stack;

public class RemoveStarsfromString {
    public static void main(String[] args) {
        String s="Leet**code**";
        System.out.println(removeStrs(s));
    }
    public static String removeStrs(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*' && st.size()>0){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        String res="";
        while(st.size()>0){
            res+=st.pop();
        }
        return res;
    }
}
