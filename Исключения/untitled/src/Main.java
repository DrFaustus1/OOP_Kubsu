import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день: ");
        int d = sc.nextInt();
        System.out.println("Введите месяц: ");
        int m = sc.nextInt();
        System.out.println("Введите год: ");
        int y = sc.nextInt();
        try{
            Data date = new Data(d,m,y);
            System.out.println("Сколько дней вы хотите прибавить к текущей дате?: ");
            int new_d= sc.nextInt();
            Data newData = date.AddDays(new_d);
        }
        catch(MyException e){
            System.out.println(e.getMessage() + " " + e.getDate());
        }

    }
}