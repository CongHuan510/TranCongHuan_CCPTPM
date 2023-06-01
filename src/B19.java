public class B19 {
    public static String subString(String s,int begin, int end){
        if(end > s.length())
            return "-1";
        String str ="";
        char s1[] = s.toCharArray();

        for(int i=begin;i<=end;i++)
            str+=s1[i];

        return str;
    }
    public static String subString(String s,int begin,int length,int x){
        if((begin + length) > s.length())
            return "-1";

        String str ="";
        char s1[] = s.toCharArray();

        for(int i=begin;i<(begin + length);i++)
            str+=s1[i];
        return str;
    }
    public static void main(String[] args) {
        String str = "tran dang khoa";
        System.out.println(subString(str,3,5,0));
    }
}
