import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);

        StudentGroup sg = new StudentGroup();

        System.out.println("Введите кол-во студентов: ");
        int n = sc.nextInt();
        for(int j = 0; j < n;j++){
            System.out.println("Введите фамилию: ");
            String f = scL.nextLine();
            System.out.println("Введите адрес: ");
            String ad = scL.nextLine();
            System.out.println("Введите факультет: ");
            String fak = scL.nextLine();
            System.out.println("Введите курс: ");
            int kurs = sc.nextInt();
            System.out.println("Введите кол-во оценок: ");
            int k = sc.nextInt();
            int []m = new int [k];
            System.out.println("Введите оценки: ");

            for(int i = 0; i < k; i++)
                m[i] = sc.nextInt();

            Student st = new Student(f,ad,fak,kurs,m);

            sg.add(st);
        }
        System.out.println("Кого удалить из списка?: ");
        String f = scL.nextLine();
        sg.del(f);
        sg.print();
    }
}