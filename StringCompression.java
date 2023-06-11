public class StringCompression {
    public static void main(String[] args) {
        char[] chars={'a','a','a','b','b','b','c','c','c','d','d'};
        System.out.println(compressed(chars));
    }
    // what to do?
    //  we have to count the consecutive characters and return the the new length of char array;
    //and modify the input char array in-place
    public static String compressed(char[] chars){
        if(chars.length==1) return "1";
        StringBuilder sb=new StringBuilder();
        char current=chars[0];
        int i=1;
        int count=1;
        int index=0;
        for(;i<chars.length;i++){
            if(chars[i]==current){
                count++;
            }
            else{
                sb.append(current);
                sb.append(count);

                chars[index++]=current;
                if(count>1){
                    String str=String.valueOf(count);
                    for(int j=0;j<str.length();j++){
                        chars[index++]=str.charAt(j);
                    }
                }
                current=chars[i];
                count=1;
            }
        }
        sb.append(current);
        sb.append(count);

        chars[index++]=current;
        if(count>1){
            String str=String.valueOf(count);
            for(int j=0;j<str.length();j++){
                chars[index++]=str.charAt(j);
            }
        }

        // System.out.println("printing the char array");
        // for(i=0;i<chars.length;i++){
        //     System.out.print(chars[i]+",");
        // }
        // System.out.println();
        return sb.toString();
    }
}
