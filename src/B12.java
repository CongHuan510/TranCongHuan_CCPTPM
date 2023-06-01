import java.util.Random;
public class B12 {
    public static void hienThi(int[][] a ,int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+ " ");

                System.out.println();
        }
    }
    public static void main(String[] args) {
        int m=2,n=3;
        int [][]a = new int[m][n];
        int [][]b = new int[m][n];
        int [][]c = new int[m][n];
        Random r = new Random();

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=r.nextInt(0,100);
            hienThi(a,m,n);

        System.out.println();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                b[i][j]=r.nextInt(0,10);
        hienThi(b,m,n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        hienThi(c,m,n);
    }
}
