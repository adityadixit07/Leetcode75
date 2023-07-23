public class GuessNumber {
    public static void main(String[] args) {
        int n=45;
        System.out.println(guessNum(n));
    }
    public static int guessNum(int n){
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int g=guessApi(n, mid);
            if(g==0){
                return mid;
            }
            else if(g==-1){
                high=mid-1;
            }
            else if(g==1){
                low=mid+1;
            }
        }
        return low;
    }


    // trying to make guess api 😄 but accoding to question we are not implementing real guess api
    // it for just satisfying the codition/ 
    public static int guessApi(int n,int picked){
        if(n>picked){
            return -1;
        }
        else if(n<picked){
            return 1;
        }
        else if(n==picked){
            return 0;
        }
        else{
            return Integer.MAX_VALUE;
        }
    }

}
