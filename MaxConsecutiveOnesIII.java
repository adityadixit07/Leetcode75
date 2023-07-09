public class MaxConsecutiveOnesIII{
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(maxConsecutiveOnesCount(arr, k));
    }
    // this problem is based on variable size window
    public static int maxConsecutiveOnesCount(int[] arr,int k){
        int i=0;
        int j=0;
        int zerocount=0;
        int max=Integer.MIN_VALUE;
        while(i<arr.length){
            if(arr[i]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(arr[i]==0){
                    zerocount--;
                }
                i++;
            }
            max=Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}