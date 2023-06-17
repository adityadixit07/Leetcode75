import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class UniqueNumberofOccurence {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,2,2,2,3,2};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(set.contains(val)){
                return false;
            }
            else{
                set.add(val);
            }
        }
        return true;
    }
}