import java.util.Arrays;

public class MaxNumofKsumPair {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=5;
        System.out.println(maxOperations(arr, k));
    }
    //  removing all the the two pairs that add up to produce K .SO we have to count the minimum operations
    public static int maxOperations(int[] arr,int k){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int operationsCount=0;
        while(left<right){
            if(arr[left]+arr[right]<k){
                left++;
            }
            else if(arr[left]+arr[right]>k){
                right--;
            }
            else{
                left++;
                right--;
                operationsCount++;
            }
        }
        return operationsCount;
    }
}
