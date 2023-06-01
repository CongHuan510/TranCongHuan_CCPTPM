import java.util.Random;

public class B11 {
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
        int [][]a = new int[2][3];
        Random r = new Random();
        for(int i=0;i<2;i++)
                for(int j=0;j<3;j++)
                a[i][j]=r.nextInt(0,100);

        for(int i=0;i<2;i++)
            for(int j=0;j<3;j++)
                System.out.print(a[i][j]+ " ");

            int Snt = -1;
        for(int i=0;i<2;i++)
            for(int j=0;j<3;j++)
                if(snt(a[i][j]) && a[i][j] > Snt){
                    Snt = a[i][j];
                }
        if(Snt != -1)
        System.out.println("\n"+Snt);
        else
            System.out.println("Khong co so nguyen to trong mang ");

    }
}
