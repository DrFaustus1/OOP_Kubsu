import java.util.*;
public class MirrorPhoto extends Photocam {

    private String typerezbi;

    MirrorPhoto(String screenRes, String matRes, int weight, String size, String typerezbi){
        super(screenRes,matRes, weight,size);
        this.typerezbi = typerezbi;

    }
    void setTyperezbi(){
        this.typerezbi = typerezbi;
    }
    String getTyperezbi(){
        return typerezbi;
    }
    public String info(){
        return super.toString() + "\n Тип резьбы: " + typerezbi;
    }
}
