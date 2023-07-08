public class MaximumAverageSubarray{
    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(max_average(arr, k));
    }
    public static int max_average(int[] arr,int k){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int average=sum/k;
        max=Math.max(max, average);
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            average=sum/k;
            max=Math.max(average,max);
        }
        return max;
    }
}
