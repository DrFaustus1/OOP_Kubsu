package org.example;
import java.util.*;
public class City {
    String name;
    int popul;
    int square;
    String okrug;
    City(String name, int popul,int square, String okrug){
        this.name = name;
        this.popul = popul;
        this.square=square;
        this.okrug = okrug;
    }
    String getName(){
        return name;
    }
    public String toString(){
        return "Название: " + name + " Население: " + popul + " Площадь: " + square + " Фед.округ: " + okrug + " ";
    }
    int getPopul(){
        return popul;
    }
    int getSquare(){
        return square;
    }
    String getOkrug(){
        return okrug;
    }
    void setName(String name){
        this.name = name;
    }
    void setPopul(int popul){
        this.popul=popul;
    }
    void setSquare(int square){
        this.square=square;
    }
    void setOkrug(String okrug){
        this.okrug= okrug;
    }







}
