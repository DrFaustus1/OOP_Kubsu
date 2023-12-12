import java.util.*;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<Integer>();
        MySet myset = new MySet(set);
        myset.fillSet();
        myset.print();

        MySet simple = myset.simple();
        System.out.println("Новое множество ");
        simple.print();

        TreeSet<Integer> d = new TreeSet<Integer>();
        MySet ns = new MySet(d);
        ns.fillSet();
        MySet res = myset.union(ns);
        System.out.println("Объединение ");
        res.print();

        MySet nesimple = myset.easy();
        System.out.println("Опять новое множество: ");
        nesimple.print();


    }
}