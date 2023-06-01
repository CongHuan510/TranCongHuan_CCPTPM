import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char s[] = str.toCharArray();
        int count = 0,Max=-1;
        for(int i =0 ;i<s.length;i++){
            count = 0;
            for(int j=0;j<s.length;j++)
                if(s[i] == s[j])
                    count++;
        if(Max < count )
            Max = count;
        }

      String result="";
        for(int i =0 ;i<s.length;i++){
            count = 0;
            for(int j=0;j<s.length;j++)
                if(s[i] == s[j])
                    count++;
            if(Max == count && result.indexOf(s[i])== -1 )
              result+= s[i]+ ",";
        }
        System.out.println(result.substring(0,result.length()-1));
    }
}
