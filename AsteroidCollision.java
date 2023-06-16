import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = { 10, 2, -5 };
        int[] output = asteroidsRemaining(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static int[] asteroidsRemaining(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int a = st.peek();
            if ((arr[i] >= 0 && a >= 0) || (arr[i] < 0 && a < 0)) {
                st.push(arr[i]);
            }
            // asteroid collison conditon
            else if ((arr[i] >= 0 && a < 0) || (arr[i] < 0 && a >= 0)) {
                // if 10 -5 then only 5 will destroy if both of same weight (10,-10) then both
                // will destroy
                // st.pop();
                if (arr[i] == -a) {
                    st.pop();

                    if (arr[i] < 0 && a >= 0) {
                        // nothing done
                        continue;
                    }

                }
            }
        }
        int res[] = new int[st.size()];
        int idx = 0;
        while (st.size() > 0) {
            res[idx++] = st.pop();
        }
        return res;
    }
}