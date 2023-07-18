import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr={73,74,75,71,69,72,76,73};
        int[] output=dailyTemperatures(arr, arr.length);
        for(int val:output){
            System.out.print(val+",");
        }
    }
    // pronblem is a varinet of next greater element to right
    public static int[] dailyTemperatures(int[] arr,int n){
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        ans[n-1]=0;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}
