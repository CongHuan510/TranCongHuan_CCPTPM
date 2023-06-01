import java.util.Scanner;

public class B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        char[] s = str.toCharArray();
        char[] s1 = str1.toCharArray();
      if(str.equals(str1))
          System.out.println("Hai chuoi giong nhau");
      else {
        if(s.length == s1.length){
            System.out.print("2 chuoi co do dai bang nhau\n");
            for(int i=0;i<s.length;i++)
                if(s[i] != s1[i]){
                    System.out.print("Doan chuoi bang nhau: ");
                    for (int j=0;j<i;j++)
                        System.out.print(s[j]);
                    System.out.println();
                }
            if(s[s.length-1] == s1[s1.length-1]){
                for(int i=s.length-1;i>=0;i--)
                    if(s[i] != s1[i]){
                        System.out.print(" , ");
                        for (int j=s.length-1;j>i;j--)
                            System.out.print(s[j]);
                        System.out.println();
                    }
            }
        }
        else {
            System.out.print("2 chuoi co do dai khong bang nhau.\n");
            if(str.compareTo(str1) > 0){
                for(int i=0;i<s.length;i++)
                    if(s[i] != s1[i]){
                        System.out.print("Doan chuoi bang nhau1: ");
                        for (int j=0;j<i;j++)
                            System.out.print(s[j]);
                        System.out.println();
                    }
            }
            else {
                        for(int k=0;k<s1.length;k++)
                            if(s[k] != s1[k]){
                                System.out.print("Doan chuoi bang nhau2: ");
                                for (int j=0;j<k;j++)
                                    System.out.print(s[j]);
                                System.out.println();
                            }
                    }
        }
        }
    }
}
