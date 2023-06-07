public class mergeStrings{
    public static void main(String[] args) {
        String str1="Aditya";
        String str2="Dixit";
        System.out.println("merged string:"+merge(str1, str2));
    }
    public static String merge(String str1,String str2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while (i<str1.length() && j<str2.length()) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(j));
            i++;
            j++;
        }
        while(i<str1.length()){
            sb.append(str1.charAt(i));
            i++;
        }
        while(j<str2.length()){
            sb.append(str2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}