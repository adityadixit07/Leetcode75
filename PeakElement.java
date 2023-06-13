public class PeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(peakIndex(arr));
    }
    // A peak element is an element that is strictly greater than its neighbors.
    public static int peakIndex(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            return low;
        }
        return low;
    }
}
