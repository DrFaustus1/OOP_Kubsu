import java.util.*;
public class Photocam {

    String screenRes;
    String matRes;
    int weight;
    String size;
    Photocam(String screenRes, String matRes, int weight, String size){
        this.screenRes = screenRes;
        this.matRes = matRes;
        this.weight= weight;
        this.size = size;
    }
    public String toString(){
        return "Разрешение экрана: " + screenRes + "\n Разрешение матрицы: " + matRes + "\n вес: " + weight + "\n размеры: " + size;
    }
    String getScreenRes(){
        return screenRes;
    }
    String getMatRes(){
        return matRes;
    }
    int getWeight(){
        return weight;
    }
    String getSize(){
        return size;
    }
    void setScreenRes(){
        this.screenRes = screenRes;
    }
    void setMatRes(){
        this.matRes = matRes;
    }
    void setWeight(){
        this.weight = weight;
    }
    void setSize(){
        this.size = size;
    }

}
