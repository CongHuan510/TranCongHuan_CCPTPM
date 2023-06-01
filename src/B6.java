public class B6 {
    public static int snt(int n){
        if(n<0)
            System.out.println("Khong la so nguyen to");
        else if(n==1 || n==2)
            System.out.println("La so nguyen to");
        else {
            for (int i =2 ;i<n/2; i++)
                if(n%i ==0 ){
                    System.out.println("Khong la so nguyen to");
                    return -1;
                }
            System.out.println("La so nguyen to");
        }
             return 1;
    }
    public static void main(String[] args) {
        System.out.println(snt(13));
    }
}
