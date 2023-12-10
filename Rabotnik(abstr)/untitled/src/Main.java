import java.util.*;
//Реализовать абстрактный класс работник с методом вычисления заработной платы.
// Унаследовать этот класс в классах работник с окладом,
// с оплатой за час, работник с процентом. Метод начисления заработной платы
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество работников: ");
            int n = sc.nextInt();
            Rabotnik []Slaves = new Rabotnik[n];

            for(int i = 0 ; i < n;i++){
                System.out.println("1 - Работник с окладом, 2 - работник с почасовой оплатой");
                int x = sc.nextInt();
                if(x == 1){
                    System.out.println("Введите сумму, которую работник получает за день: ");
                    int moneyDay = sc.nextInt();
                    System.out.println("Введите количество отработанных дней: ");
                    int days = sc.nextInt();
                    RabOklad Vlad = new RabOklad(days, moneyDay);
                    Slaves[i] = Vlad;
                }
                if(x == 2){
                    System.out.println("Введите кол-во отработанных часов: ");
                    int hours = sc.nextInt();
                    System.out.println("Введите кол-во отработанных дней: ");
                    int days1 = sc.nextInt();
                    System.out.println("Введите оплату за час: ");
                    int moneyPerHour = sc.nextInt();
                    RabHour Vladislav = new RabHour(hours,moneyPerHour,days1);
                    Slaves[i] = Vladislav;
                }
            }
            for(int i = 0 ; i < n;i++){
                Slaves[i].print();
            }


        }
}
