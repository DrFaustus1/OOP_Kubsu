class ArifProg extends Progression{
    private int step;
    private int first_el;
    ArifProg(int step, int first_el){
        this.step = step;
        this.first_el = first_el;
    }
    @Override double sumofN(int n){
        return ((2*first_el + step*(n-1))/2) * n;
    }
    @Override double N_element(int k){
        return first_el+(k-1)*step;
    }
}
