 class GeomProg extends Progression {

    private int step;
    private int first_elem;

    GeomProg(int step, int first_elem){
        this.first_elem = first_elem;
        this.step = step;
    }
    @Override double sumofN(int n){
        return ((first_elem*(Math.pow(step,n) - 1))/(step-1));
    }
    @Override double N_element(int k){
        return (first_elem * Math.pow(step,k-1));
    }
}
