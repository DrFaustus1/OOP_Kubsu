import java.util.*;

public class Taxi extends Avto{
    private String driver;
    private int pricekm;
    Taxi(String marka, String number, String vin, int year, double vol, int price, int km, String driver, int pricekm){
        super(marka, number,vin, year, vol, price,km);
        this.driver = driver;
        this.pricekm = pricekm;

    }
    double cost(double km){
        return km*pricekm;
    }
    String getDriver(){
        return driver;
    }
    int getPricekm(){
        return pricekm;
    }
    void setDriver(){
        this.driver = driver;
    }
    void setPricekm(){
        this.pricekm = pricekm;
    }
    public String toString(){
        return super.toString() + "\n Водитель" + driver + "\n Цена за км" + pricekm;
    }

}
