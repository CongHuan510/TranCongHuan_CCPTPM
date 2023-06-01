public class B3 {
    public static long gt(int n ){
        if(n==0 || n== 1)
            return 1;
        else
            return  n*gt(n-1);
    }
    public static void main(String[] args) {
        System.out.println(gt(5));
    }
}
