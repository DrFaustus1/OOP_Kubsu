public class MyException extends Exception{
    int d,m,y;
    MyException(String name,int d,int m,int y){
        super(name);
        this.d = d;
        this.m = m;
        this.y = y;
    }
    String getDate(){
        return d + "." + m + "." + y;
    }
}
