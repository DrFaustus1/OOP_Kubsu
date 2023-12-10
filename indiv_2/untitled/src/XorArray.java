import static java.lang.Math.*;
import java.util.Arrays;
public class XorArray implements Array{
    private int b[];

    XorArray(int []b){
        this.b = b;
    }


    @Override
    public int[] plust(int []e){
        int [] c = new int [b.length+e.length];
        int index = 0;

        for(int i = 0; i < b.length;i++){
            c[index] = b[i];
            index++;
        }
        for(int j = 0; j < e.length;j++){
            boolean isDuplicate = false;
            for(int k = 0; k < index;k++){
                if(e[j] == c[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                c[index] = e[j];
                index++;
            }
        }
        return Arrays.copyOf(c,index);
    }

    @Override
    public void checkout(){
        for(int i = 0 ; i < b.length;i++) {
            double f = Math.sqrt(b[i]);
            b[i] = (int)f;

        }

    }
    @Override
    public void print(){
        for(int i : b)
            System.out.println(i + " ");
    }
}
