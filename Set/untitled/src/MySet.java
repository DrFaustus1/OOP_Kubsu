import com.sun.source.tree.Tree;

import java.util.*;
import java.util.TreeSet;
public class MySet {
    TreeSet<Integer> set;

    MySet(TreeSet<Integer> set){
        this.set=set;
    }
    TreeSet<Integer> getSet(){
        return set;
    }
    void fillSet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы множества: ");
        int x = sc.nextInt();
        while(x!=0){
            set.add(x);
            x = sc.nextInt();
        }
    }
    void print(){
        Iterator it = set.iterator();
        System.out.println("My set: ");
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println();
    }
    MySet simple(){
        TreeSet<Integer> set1 = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while(it.hasNext()){
            int k = 0;
            Integer x = (Integer) it.next();
            for(int i = 1 ; i <= x;i++){
                if(x % i == 0)
                    k++;
            }
            if(k == 2)
                it.remove();
        }
        return new MySet(set1);
    }
    MySet union(MySet a){
        TreeSet <Integer> set1 = a.getSet();
        TreeSet<Integer> res = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while(it.hasNext())
            res.add((Integer)it.next());
        return new MySet(res);
    }
    MySet easy(){
        TreeSet<Integer> pizda = new TreeSet<Integer>(set);
        Iterator it = pizda.iterator();
        while(it.hasNext()){
            int f = 0;
            Integer r = (Integer) it.next();
            for(int i = 2; i < r;i++){
                if(r % i == 0){
                    f = 1;
                    break;
                }

            }
            if(f == 1)
                it.remove();
        }
    return new MySet(pizda);
    }
}
