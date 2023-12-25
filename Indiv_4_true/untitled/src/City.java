import java.util.*;
public class City implements Comparator <City> {
    String name, okrug;
    int popul;
    char plosh;
    City(String name, String okrug, int popul) {
        this.name = name;
        this.okrug = okrug;
        this.popul = popul;
        this.plosh = plosh;
    }
    public String getName() {
        return name;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getPopul() {
        return popul;
    }
    public char getPlosh(){return plosh;}

    public void setName(String name) {
        this.name = name;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public void setPopul(int cl) {
        this.popul = cl;
    }
    public void setPlosh(char cl){this.plosh =cl;}


    public String print() {
        return "Название: " + name + " Округ: " + okrug + " Население: " + popul + " " + plosh;
    }
    public int compare(City o1, City o2) {
        return o1.getName().compareTo(o2.getName());
    }
    public static Comparator<City> NameComparator = new Comparator<City>() {
        public int compare(City o1, City o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<City> ClassComparator = new Comparator<City>() {
        public int compare(City o1, City o2) {
            if (o1.getPopul()==o2.getPopul()){
                if (o1.getPlosh()==o2.getPlosh()) return 0;
                if (o1.getPlosh()>o2.getPlosh()) return 1;
                return -1;
            }
            return o1.getPopul()-o2.getPopul();
        }

    };
}