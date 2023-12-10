package org.example;
import java.util.*;
public class CityGroup {
    ArrayList<City> a;
    CityGroup(){
        a = new ArrayList<City>();
    }
    void add(City s){
        a.add(s);
    }
    void del(String s){
        int p = -1;
        for(int i = 0; i < a.size();i++){
            if(s.equalsIgnoreCase(a.get(i).getName())) {
                p = i;
            }

        }
        a.remove(p);
    }
    void search(String s) throws NullPointerException{
        City p = null;
        for(int i = 0; i < a.size();i++){
            if(s.equalsIgnoreCase(a.get(i).getName()))
                p = a.get(i);
        }
       try{
           System.out.println(p.toString());
       }
       catch (NullPointerException e){
           System.out.println("Такого города не существует");
       }
    }
    void print(){
        for(int i = 0; i < a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
    void sortPopul(){
        int temp = 0;
        for(int i =0 ; i < a.size()-1;i++){
            for(int j = 0; j < a.size()-i-1;j++){
                if(a.get(j).getPopul() > a.get(j+1).getPopul()){
                    temp = a.get(j).getPopul();
                    a.get(j).setPopul(a.get(j+1).getPopul());
                    a.get(j+1).setPopul(temp);
                }
            }
        }
    }
    void sortSquare(){
        int temp = 0;
        for(int i = 0; i < a.size()-1;i++){
            for(int j = 0; j < a.size()-i-1;j++){
                if(a.get(j).getSquare() > a.get(j+1).getSquare()){
                    temp = a.get(j).getSquare();
                    a.get(j).setSquare(a.get(j+1).getSquare());
                    a.get(j+1).setSquare(temp);
                }
            }
        }
    }
}
