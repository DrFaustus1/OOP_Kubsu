import java.util.*;
class Shar extends Body {
    double r;
    Shar(double r){
        this.r = r;
    }
    @Override double S(){
        return 2*Math.PI * r;
    }
    @Override double V(){
        return 4/3 * Math.PI * r * r;
    }
    @Override void print(){
        System.out.println("Шар = " + r);
    }

}
