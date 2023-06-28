public class CanPlaceFlower{
    public static void main(String[] args) {
        int[] flower={1,0,0,0,1,0,0};
        int totalflowertoplant=2;
        System.out.println(canPlace(flower, totalflowertoplant));
    }
    public static boolean canPlace(int[] flower,int totalflowertoplant){
        int n=flower.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(flower[i]==0){
                int left=(i==0)?0:flower[i-1];
                int right=(i==n-1)?0:flower[i+1];
                if(left==0 && right==0){
                    count++;
                    flower[i]=1;
                }
            }
            if(count>=totalflowertoplant){
                return true;
            }
        }
        return false;
    }
}