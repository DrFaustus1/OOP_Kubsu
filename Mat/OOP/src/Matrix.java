import java.util.*;
public class Matrix {
        int [][]m;

        Matrix(int [][] m){
            this.m = m;
        }
        int sumKrat(){
            int sm = 0;
            for(int i = 0; i < m.length;i++){
                for(int j =0; j < m[i].length;j++){
                    if(i % 2 == 0 && m[i][j] % 3 == 0 && j % 2 == 0)
                        sm+=m[i][j];
                }
            }
            return sm;
        }
        private boolean isPerf(int n){
            int sm = 0;
            for(int i = 1; i <n;i++){
                if(n % i == 0)
                    sm+=i;
            }
            return n == sm;
        }
        void Obnul(){
            for(int i = 0 ; i < m.length;i++){
                for(int j = 0;j < m[i].length;j++){
                    if(i < j&& isPerf(m[i][j]))
                        m[i][j] = 0;
                }
            }
        }
        void print(){
            for(int i =0 ; i < m.length;i++){
                for(int j = 0 ; j < m[i].length;j++)
                    System.out.println(m[i][j] + " ");
                System.out.println();
            }

        }

}

