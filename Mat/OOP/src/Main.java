import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во строк и столбцов");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print("Задайте любое число");
        int x = sc.nextInt();

        int [][]mat= new int[n][m];

        for(int i = 0; i < n;i++)
            for(int j = 0 ; j < m;j++){
                mat[i][j]=sc.nextInt();
            }
        Matrix ma=new Matrix(mat);

        System.out.print(ma.prPerfect());
        
    }
}
//6 1 6 4
//2 3 4 5
//6 1 2 3
//6 6 6 6