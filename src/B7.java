import java.util.Arrays;

public class B7 {
    public static int timKiem(int l, int r, int a[], int x){
        if(r>=l){
           int mid = (l+r)/2;
           if(a[mid] == x )
               return mid;

            if(a[mid] > x) return timKiem(l,mid-1,a,x);
            else return timKiem(mid+1,r,a,x);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a= new int[] {1,5,-4,8,9,5,-7};
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        System.out.print(a[i]+ " ");

        System.out.println("\n"+(timKiem(0,a.length-2,a,5)));
    }
}
