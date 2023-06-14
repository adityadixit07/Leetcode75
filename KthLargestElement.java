import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int k=4;
        System.out.println(kthLargest(arr, k));
    }   
    // target-> we have to find the kth largest in array
    public static int kthLargest(int[] arr,int k){
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++){
            maxheap.add(arr[i]);
        }
        int val=0;
        for(int i=0;i<k;i++){
            val=maxheap.remove();
        }
        return val;
    }
}
