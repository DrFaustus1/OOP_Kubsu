import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите начальное значении прогрессии: ");
        int first = sc.nextInt();
        System.out.println("Введите шаг прогресии: ");
        int step = sc.nextInt();
        System.out.println("1-арифметическая прогрессия, 2-геометрическая: ");
        int f = sc.nextInt();
        if(f == 1){
            ArifProg big = new ArifProg(step,first);
            System.out.println("Сумму скольких членов вы хотите посчитать?: ");
            int n = sc.nextInt();
            System.out.println("Член с каким номером вас интересует?: ");
            int chel = sc.nextInt();
            System.out.println("Сумма " + n + "членов ариф.прогрессии = " + big.sumofN(n) + "\n Член с номером " + chel + "= " + big.N_element(chel));
        }
        else if(f == 2){
            GeomProg small = new GeomProg(step,first);
            System.out.println("Сумму скольких членов вы хотите посчитать?: ");
            int n = sc.nextInt();
            System.out.println("Член с каким номером вас интересует?: ");
            int chel = sc.nextInt();
            System.out.println("Сумма " + n + "членов геом.прогрессии = " + small.sumofN(n) + "\n Член с номером " + chel + "= " + small.N_element(chel));
        }

    }
}