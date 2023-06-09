
public class ProductofArrExceptSelf {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] res=productItself(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+",");
        }
    }
    public static int[] productItself(int[] nums){
        int[] res=new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int rightprod=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=rightprod;
            rightprod*=nums[i];
        }
        return res;
    }
}