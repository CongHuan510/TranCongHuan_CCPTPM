import java.util.Arrays;

public class B10 {
    public static boolean snt(int n){
        if(n<0)
            return false;
        else if(n==1 || n==2)
            return true;
        else {
            for (int i =2 ;i<n/2; i++)
                if(n%i ==0 )
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a= new int[] {1,5,-4,8,9,5,-7};
        for(int i=0;i<=a.length-1;i++)
            System.out.print(a[i]+ " ");

        int[] b = new int[a.length];
        int j=-1;
        for (int i=0;i <= a.length-1;i++)
            if(snt(a[i])){
                j++;
                b[j] = a[i];
            }
        Arrays.sort(b,0,j);

            int n=j;
            Boolean kt;
        for (int i=0;i <= a.length-1;i++){
            kt = true;
            for(int k = 0;k <= n;k++)
                if(a[i] == b[k]){
                    kt = false;
                }
            if(kt){
                j++;
                b[j]=a[i];
            }
        }
        System.out.println();
        for(int i=0;i <= b.length-1;i++)
            System.out.print(b[i]+ " ");
    }
}
