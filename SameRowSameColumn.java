import java.util.HashMap;
import java.util.Map;

public class SameRowSameColumn {
    public static void main(String[] args) {
        int[][] arr={{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(totalRowColumnSame(arr));

    }
    // second column and third row is same 
    // A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
    public static int totalRowColumnSame(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        HashMap<String,Integer> rowhash=new HashMap<>();
        HashMap<String,Integer> colhash=new HashMap<>();
        // first we store the all row entries
        for(int i=0;i<row;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<col;j++){
                sb.append(arr[i][j]).append("#");
            }
            rowhash.put(sb.toString(),rowhash.getOrDefault(sb.toString(), 0)+1);
        }
        //now store the all column entries
        for(int j=0;j<col;j++){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<row;i++){
                sb.append(arr[i][j]).append('#');
            }
            colhash.put(sb.toString(),colhash.getOrDefault(sb.toString(), 0)+1);
        }
        // now we make our answer
        int count=0;
        for(Map.Entry<String,Integer> entry:rowhash.entrySet()){
            String rhash=entry.getKey();
            if(colhash.containsKey(rhash)){
                count+=colhash.get(rhash)*rowhash.get(rhash);
            }
        }
        return count;
    }

}
