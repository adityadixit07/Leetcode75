import java.util.ArrayList;
import java.util.List;

public class KidWithGreaterNoCandies {
    public static void main(String[] args) {
        int[] candies={12,1,12};
        int extraCandies=10;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }   
    public static List< Boolean> kidsWithCandies(int[]candies,int extraCandies){
        List<Boolean> res=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int val:candies){
            max=Math.max(max,val);
        }
        for(int val:candies){
            int sum=val+extraCandies;
            if(sum>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;

    }
}