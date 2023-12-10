import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите данные фотоаппарата: ");
            System.out.println("Разрешение экрана: ");
            String raz = sc.nextLine();
            System.out.println("Разрешение матрицы: ");
            String raz2 = sc.nextLine();
            System.out.println("Вес: ");
            int wei = sc.nextInt();
            String q = sc.nextLine();
            System.out.println("Размеры: ");
            String size = sc.nextLine();

            Photocam nikon = new Photocam(raz, raz2, wei, size);
            System.out.println("Данные для фотоаппарата: ");
            System.out.println(nikon.toString());


            System.out.println("Введите тип резьбы фотоаппарата: ");
            String type = sc.nextLine();
            MirrorPhoto panasonic = new MirrorPhoto(raz,raz2,wei,size,type);
            System.out.println(panasonic.info());

        }
    }
