import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Body []b;
        System.out.println("Введите кол-во элементов: ");
        int k = sc.nextInt();
        b = new Body[k];

        for(int i = 0; i < k;i++){
            System.out.println("1 - шар, 2 - параллелограмм");
            int p = sc.nextInt();
            if(p == 1){
                System.out.println("Введите r: ");
                double r = sc.nextDouble();
                Shar shar = new Shar(r);
                b[i] = shar;
            }
            if (p == 2){
                System.out.println("Введите 3 стороны: ");
                double a = sc.nextDouble();
                double b1 = sc.nextDouble();
                double c = sc.nextDouble();
                Paral paral = new Paral(a,b1,c);
                b[i] = paral;
            }
        }
        for(int i = 0 ; i < k; i++){
            b[i].print();
            System.out.println("S = " + b[i].S() + " " + "V= " + b[i].V());

        }
    }
}