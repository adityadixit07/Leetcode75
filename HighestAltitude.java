public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(peakAltitude(arr));
    }
    public static int peakAltitude(int[] arr){
        int sum=arr[0];
        int max=0;
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,sum);
            sum+=arr[i];
        }
        return Math.max(max, sum);
    }
}
// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
