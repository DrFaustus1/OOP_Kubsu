import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во уравнений которые вы хотите порешать: ");
        int n = sc.nextInt();
        Root []rt = new Root[n];

        for(int i = 0; i < n;i++){
            System.out.println("Какое уравнение вы хотите решить: 1 - линейное, 2 - квадратное " );
            int x = sc.nextInt();
            if (x == 1){
                System.out.println("Введите a и b :");
                int a = sc.nextInt();
                int b = sc.nextInt();
                Linear yep = new Linear(a,b);
                rt[i] = yep;
            }
            if (x == 2){
                System.out.println("Введите a, b, c : ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int c = sc.nextInt();
                QuadroPizdets neyep = new QuadroPizdets(a1,b1,c);
                rt[i] = neyep;
            }
        }
        for(int i = 0 ; i < n;i++){
            rt[i].print();
            System.out.println(" Решение ур-я: " + rt[i].Corni());
        }

    }
}