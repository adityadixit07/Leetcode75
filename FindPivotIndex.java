public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] arr) {
        int n = arr.length;
        int leftsum[] = new int[n];
        int rightsum[] = new int[n];
        int idx = n - 2;
        leftsum[0] = 0;
        rightsum[n - 1] = 0;
        int ls = arr[0];
        int rs = arr[n - 1];
        for (int i = 1; i < n; i++) {
            leftsum[i] = ls;
            rightsum[idx] = rs;
            ls += arr[i];
            rs += arr[idx];
            idx--;
        }
        for (int i = 0; i < n; i++) {
            if (leftsum[i] == rightsum[i]) {
                return i;
            }
        }
        return -1;
    }
}
