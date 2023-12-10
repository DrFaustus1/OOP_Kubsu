import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a,b,e;

        System.out.println("Введите размерность 1-го массива: ");
        int n = sc.nextInt();
        a = new int[n];

        System.out.println("Введите размерность 2-го массива: ");
        int n1 = sc.nextInt();
        b = new int [n1];

        System.out.println("Элементы 1-го массива: ");

        for(int i = 0 ; i < a.length;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Элементы 2-го массива: ");

        for(int i = 0 ; i < b.length;i++){
            b[i] = sc.nextInt();
        }

        SortArray a1 = new SortArray(a);
        XorArray b1 = new XorArray(b);

        System.out.println("Объединение множеств первого массива и второго: ");
        e = a1.plust(b);
        for(int num: e)
            System.out.println(num + " ");
        System.out.println("Сортировка первого массива: ");
        a1.checkout();
        a1.print();
        System.out.println("Исключающее или первого и второго массива: ");
        e = b1.plust(a);
        for(int num : e)
            System.out.println(num);
        System.out.println("Вычисление корня второго массива: ");
        b1.checkout();
        b1.print();
    }
}