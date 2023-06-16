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
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (st.isEmpty() || a > 0) {
                st.push(arr[i]);
            }
            // asteroid collison conditon
            else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < -a) {
                    st.pop();
                }

                if (st.isEmpty() || st.peek() < 0) {
                    st.push(a);
                } else if (st.peek() == -a) {
                    st.pop();
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