import java.util.ArrayList;

public class CityGroup {
    ArrayList<City> a;
    CityGroup(){
        a = new ArrayList<City>();
    }
    void find(String name, int pop, char pl){
        int p=-1;
        for (int i=0; i<a.size(); i++){
            if (name.equalsIgnoreCase(a.get(i).getName()) && pop ==a.get(i).popul && pl ==a.get(i).plosh) p=i;
        }
        if (p>-1){
            System.out.println("Такой город есть, его номер - " + p);
        }
        else System.out.println("Такого города нет");
    }
    void add(City s){a.add(s);}
    void del(String fio){
        int p=-1;
        for (int i=0; i<a.size(); i++){
            if (fio.equalsIgnoreCase(a.get(i).getName())) p=i;
        }
        if (p>-1){
            a.remove(p);
            System.out.println("Удалили город - "+fio);
        }
        else System.out.println("Такого города нет");
    }
    void SortByName(){
        a.sort(City.NameComparator);
    }
    void SortByPop(){
        a.sort(City.ClassComparator);
    }
    public ArrayList <City> get(){
        return a;
    }

    String print() {
        String s = "";
        for (int i = 0; i < a.size(); i++) s += a.get(i).print() +"\n";
        return s;
    }
}