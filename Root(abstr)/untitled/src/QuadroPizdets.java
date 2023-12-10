public class QuadroPizdets extends Root {

    int a,b,c;

    QuadroPizdets(int a, int b,int c){
        this.a=a;
        this.b = b;
        this.c = c;
    }

    @Override
    double Corni() {
        double D = Math.pow(b,2) - 4 * a * c;
        return (-b + Math.sqrt(D))/(2*a);
    }
    @Override
    void print(){
       System.out.println("Коэф-т a = "  + a + " Коэф-т b = " + b + " Коэф-т c = " + c);
    }
}
