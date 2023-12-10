import java.util.*;
public class Matrix {

    Scanner sc = new Scanner(System.in);
    int[][] m;

    Matrix(int[][] m) {
        this.m = m;
    }

    void print() {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j]);
    }

    boolean prost(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    boolean perfect(int x) {
        int sm = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0)
                sm += i;
        }
        return x == sm;
    }

    int sumprost() {
        int sm = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) {
                if (i < j && prost(m[i][j]))
                    sm += m[i][j];
            }
        return sm;
    }

    void swapchet(int x) {
        for (int j = 0; j < m[x].length; j++) {
            if (m[x][j] % 2 == 0)
                m[x][j] = 0;
        }
    }

    void twoperfect() {
        int k;
        for (int i = 0; i < m.length; i++) {
            k = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (perfect(m[i][j]))
                    k++;
            }
            if (k >= 2) {
                swapchet(i);
            }
        }
    }

    int prdiag(int x){
        int pr = 1;
        for(int i = 0 ; i < m.length;i++)
            for(int j = 0; j < m[i].length;j++){
                if(i > j && m[i][j] > x)
                    pr*=m[i][j];
            }
        return pr;
    }

    int prPerfect(){
        int pr = 1;
        for(int i =0 ; i < m.length;i++)
            for(int j = 0 ; j < m[i].length;j++){
                if(perfect(m[i][j]))
                    pr*=m[i][j];
            }
        return pr;
    }


}

