import java.util.Arrays;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        int[] a= new int[] {1,5,-4,8,9,5,-7};
        Arrays.sort(a);
        int []b = new int[a.length];

        for(int i=0;i<a.length-1;i++)
            b[i]=a[i];

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap x: ");
        int x = sc.nextInt();
        int vt=0;
        for(int i=0;i<a.length-1;i++)
            if(x > a[i])
                vt = i;

        for(int i=b.length-1;i>vt;i--)
            b[i]=b[i-1];
        b[vt+1] =x;

        for(int i=0;i<b.length-1;i++)
            System.out.print(b[i]+ " ");
    }
}
