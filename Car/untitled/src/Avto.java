import java.util.*;
public class Avto{
    String marka;
    String number;
    String vin;
    int year;
    double vol;
    int price;
    int km;
    Avto(String marka, String number, String vin, int year, double vol, int price, int km){
        this.marka = marka;
        this.number = number;
        this.vin = vin;
        this.year = year;
        this.vol = vol;
        this.price= price;
        this.km = km;
    }
    public String toString(){
        return "Марка: " +  marka + "\n Номер " + number + "\n Вин " + vin + "\n Год " + year + "\n Объем двигателя" + vol + "\n Цена: " + price + "\n Пробег" + km;
    }
    String getMarka(){
        return marka;
    }
    String getNumber(){
        return number;
    }
    String vin(){
        return vin;
    }
    int getYear(){
        return year;
    }
    double getVol(){
        return vol;
    }
    int getPrice(){
        return price;
    }
    int getKm(){
        return km;
    }

    void setMarka(){
        this.marka=marka;
    }
    void setNumber() {
        this.number = number;
    }
    void setVin(){
        this.vin = vin;
    }
    void setYear(){
        this.year = year;
    }
   void setVol(){
        this.vol = vol;
   }
    void setPrice(){
        this.price = price;
    }
    void setKm(){
        this.km = km;
    }
}





