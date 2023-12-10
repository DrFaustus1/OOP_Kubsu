public class SortArray implements Array{

    private int a[];

    SortArray(int a[]){
        this.a = a;
    }

    @Override
    public int[] plust(int e[]){
        int [] c = new int [a.length + e.length];

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(e,0,c,a.length,e.length);

        return c;
    }
   @Override
    public void checkout(){
        int temp=0;
        for(int i = 0; i < a.length-1;i++){
            for(int j = 0; j < a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    @Override
    public void print(){
        for(int num : a){
            System.out.println(num + " ");
        }
    }
}
