import java.util.Arrays;
import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char s[] = str.toCharArray();
        String s1="";

        int j=0;
        for(int i=0;i<s.length-1;i++){
            if(s1.indexOf(s[i]) == -1){
                s1+=s[i]+ " ";
                j++;
            }
        }
        System.out.println("Cac ki tu co trong chuoi la: "+ s1 +"\nSố lượng phan tutra: "+(s1.length()-j));
    }
}
