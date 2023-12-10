import java.util.*;

public class Book implements Comparator<Book> {
    private String name;
    private int year;

    Book(String name, int year){
        this.name = name;
        this.year = year;
    }
    public int compare(Book b1, Book b2){
        return b1.getYear() - b2.getYear();
    }
    String getName(){
        return name;
    }
    int getYear(){
        return year;
    }
    void setYear(int year){
        this.year = year;
    }
    void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "Название книги: " + name + " год издания: " + year;
    }

}
