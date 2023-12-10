
public class Dot {
    int x, y;
    Dot(int x, int y){
        this.x=x;
        this.y=y;

    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    double dist(int x, int y){
        int dx = this.x - x;
        int dy = this.y-y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    double dist(Dot p){
        return dist(p.getX(), p.getY());
    }
}
