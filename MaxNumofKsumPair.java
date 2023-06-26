import java.util.Arrays;
import java.util.HashMap;

public class MaxNumofKsumPair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 5;
        System.out.println(maxOperations(arr, k));
        System.out.println(maxOperations2(arr, k));
    }

    // removing all the the two pairs that add up to produce K .SO we have to count
    // the minimum operations
    public static int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int operationsCount = 0;
        while (left < right) {
            if (arr[left] + arr[right] < k) {
                left++;
            } else if (arr[left] + arr[right] > k) {
                right--;
            } else {
                left++;
                right--;
                operationsCount++;
            }
        }
        return operationsCount;
    }
    // time complexity:O(nlogn)+O(n);
    // space complexity:O(1)

    // now we move to the hashamp to optimise the time complexity
    public static int maxOperations2(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int remainingSum = k - arr[i];
            if (map.containsKey(remainingSum)) {
                count++;
                if (map.get(remainingSum) == 1) {
                    map.remove(remainingSum);
                } else {
                    map.put(remainingSum, map.get(remainingSum) - 1);
                }
            } else {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }
        return count;

    }
}
