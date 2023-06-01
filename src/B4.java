
public class B4 {
    public static long C(int m, int n){
        if(m > n ){
            int tmp = m;
            m=n;
            n=m;
        }
        B3 b3 = new B3();
        return (b3.gt(n)/(b3.gt(n-m)*b3.gt(m)));

    }
    public static void main(String[] args) {
    B3 b3 = new B3();
        System.out.println(C(3,5));
    }
}
