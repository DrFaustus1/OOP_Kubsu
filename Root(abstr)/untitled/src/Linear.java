public class Linear extends Root{
    int a,b;
    Linear(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override double Corni(){
        for(int i = -100 ; i < 900; i ++){
            if(a * i - b == 0)
                return i;
        }
    return 0;
    }
    @Override void print(){
        System.out.println("Коэффициент a = " + a + " Коэффициент b =  "+ b);
    }
}
