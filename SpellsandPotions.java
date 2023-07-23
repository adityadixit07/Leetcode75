import java.util.Arrays;

public class SpellsandPotions {
    public static void main(String[] args) {
        int[] spells={5,1,3};
        int[] potions={1,2,3,4,4};
        int success=7;
        // output
        int[] output=successfulPairs(spells, potions, success);
        for(int val:output){
            System.out.print(val+",");
        }
    }
    public static int[] successfulPairs(int[] spells,int[] potions,int success){
        int[] res=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int val=spells[i];
            int low=0;
            int high=potions.length-1;
            int temp=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                int prod=val*potions[mid];
                if(prod>=success){
                    temp=potions.length-mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            res[i]=temp;
        }
        return res;
    }
}
