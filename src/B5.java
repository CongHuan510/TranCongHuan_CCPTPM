public class B5 {
    public static int UCLN(int a, int b){
        if(b==0) return a;
        if(a % b == 0)
            return b;
        else return UCLN(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(UCLN(4,6));
    }
}
