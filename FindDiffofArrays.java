import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDiffofArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int val : nums1) {
            set1.add(val);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int val : nums2) {
            set2.add(val);
        }
        for (int val : set1) {
            if (set2.contains(val) == false) {
                res1.add(val);
            }
        }
        List<Integer> res2 = new ArrayList<>();
        for (int val : set2) {
            if (set1.contains(val) == false) {
                res2.add(val);
            }
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}
