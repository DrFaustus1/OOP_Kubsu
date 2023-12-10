import java.util.*;
public class Student implements Comparator<Student>{
    private String fio,adress,faculty;
    private int kurs;
    private int [] marks;

    Student(String fio, String adress, String faculty, int kurs,int[] marks){
        this.fio = fio;
        this.adress = adress;
        this.faculty = faculty;
        this.kurs = kurs;
        this.marks = marks;
    }

    Student(){
        fio = "Иванов";
        adress= "Краснодар";
        faculty = "Фпм";
        kurs = 2;
        marks = new int[5];
        for(int i = 0 ; i < 5;i++)
            marks[i] = 3;
    }
    String getFio(){
        return fio;
    }
    int getKurs(){
        return kurs;
    }
    void setFio(String fio){
        this.fio = fio;
    }
    double sr(){
        double s = 0;
        for(int i = 0 ; i < marks.length;i++)
            s+=marks[i];
        return s/marks.length;
    }
    public String toString(){
        String s =" ";
        for(int i = 0 ; i < marks.length;i++){
            s+=String.valueOf(marks[i]);
            s+="";
        }
    return "хх";
    }
    public int compare(Student s1, Student s2){
        return s1.getKurs()- s2.getKurs();
    }


}
