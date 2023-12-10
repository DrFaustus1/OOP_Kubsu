package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);
        System.out.println("Введите кол-во городов: ");
        int n = sc.nextInt();

        CityGroup sg = new CityGroup();

        for(int i = 0 ; i < n;i++){
            System.out.println("Введите название города: ");
            String nm = scl.nextLine();
            System.out.println("Введите население города: ");
            int pop = sc.nextInt();
            System.out.println("Введите площадь города: ");
            int sq = sc.nextInt();
            System.out.println("Введите федеральный округ в котором находится город: ");
            String ok = scl.nextLine();
            City st = new City(nm,pop,sq,ok);

            sg.add(st);
        }
        System.out.println("Какой город удалить из списка? ");
        String x = scl.nextLine();
        sg.del(x);
        sg.print();
        System.out.println();
        System.out.println("По какому признаку хотите вы остортировать списко городов? 1- по населению, 2 - по площади:  ");
        int f = sc.nextInt();
        if(f == 1){
            sg.sortPopul();
            sg.print();
            System.out.println("Давайте и по площади тоже :)");
            sg.sortSquare();
            sg.print();
        }
        else if(f == 2){
            sg.sortSquare();
            sg.print();
            System.out.println("Давайте и по населению тоже :)");
            sg.sortPopul();
            sg.print();
        }
    }

}