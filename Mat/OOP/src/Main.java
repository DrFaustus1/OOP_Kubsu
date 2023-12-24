import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размерность квадратной матрицы: ");
        int n = sc.nextInt();
        int [][] b = new int[n][n];
        for(int i = 0 ; i < b.length;i++){
            for(int j = 0; j < b[i].length;j++)
                b[i][j] = sc.nextInt();
        }
        Matrix a = new Matrix(b);
        System.out.println("Сумма кратных 3, у которых четные индексы: "+ a.sumKrat());
        System.out.println("Матрица, с обнуленными совершенными элементами, выше главной диагонали:  ");
        a.Obnul();
        a.print();
    }
}
//6 1 6 4
//2 3 4 5
//6 1 2 3
//6 6 6 6