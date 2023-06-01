import java.util.Scanner;

public class B16 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            while (str.indexOf("\t") !=-1)
                str.replace('\t',' ');

        while (str.indexOf("  ") !=-1)
            str.replace("  "," ");
        str = str.trim();


        char s[] = str.toCharArray();
        s[0]= Character.toUpperCase(s[0]);
        for(int i=0;i<s.length;i++){
            if(s[i] == ' '){
                s[i+1] =Character.toUpperCase(s[i+1]);
            }
        }
        for(int i=0;i<s.length;i++)
        System.out.print(s[i]);
}
}
