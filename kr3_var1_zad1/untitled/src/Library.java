import java.util.*;
public class Library{
    ArrayList<Book> a;

    Library(){
        a = new ArrayList<Book>();
    }
    void add(Book s){
        a.add(s);
    }
    void del(String name){
        int p = -1;
        for(int i = 0 ; i < a.size();i++){
            if(name.equalsIgnoreCase(a.get(i).getName()))
                p = i;
        }
        if (p > -1){
            a.remove(p);
            System.out.println("Удалили книгу: " + name);
        }
        else
            System.out.println("Такой книги нет ");
    }
    public static Comparator<Book> YearComparator=new Comparator<Book>(){
        public int compare(Book b1, Book b2){
            return b1.getYear()-b2.getYear();
        }
    };
    void sortByYear(){
        Book b = new Book();
        a.sort(b);
    }

}
