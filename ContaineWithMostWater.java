public class ContaineWithMostWater {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){
        int maxarea=0;
        int maxprod=1;
        int i=0;
        int j=height.length-1;
        while(i<j){
            maxprod=Math.min(height[i], height[j])*(j-i);
            maxarea=Math.max(maxarea, maxprod);
            if(height[i]>=height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxarea;
    }
}

// You are given an integer array height of length n. There are n vertical lines
// drawn such that the two endpoints of the ith line are (i, 0) and (i,
// height[i]).
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array
// [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
// container can contain is 49.