import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s="2[abc]3[cd]ef";
        System.out.println(decodedString(s));
    }
    public static String decodedString(String s){
        StringBuilder res=new StringBuilder();
        char currStr='0';
        char currNum='0';
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                st.push(currNum);
                st.push(currStr);
            }
            else if(ch==']'){

            }
            else if(Character.isDigit(ch)){

            }
            else{

            }
        }

        return res.toString();
    }
}
// Input: s = "2[abc]3[cd]ef"
// Output: "abcabccdcdcdef"