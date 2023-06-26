public class IncreasingTripletSubsequence{
    public static void main(String[] args) {
        int[] arr={3,2,4,12,56,78,89,90};
        // increasing triplet subsequnce is 2,4,12 and many others also.
        System.out.println(isSubsequence(arr));
    }
    public static boolean isSubsequence(int[] arr){
        if(arr.length<3){
            return false;
        }
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int val:arr){
            if(val<first){
                first=val;
            }
            if(val>first){
                second=Math.min(val, second);
            }
            if(val>second){
                return true;
            }
        }
        return false;
    }
}