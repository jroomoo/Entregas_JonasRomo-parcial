package model;

public class Model {
    private int n1;
    private int n2;
    private int sum;
    public Model(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Model() {
        this.n1 = 0;
        this.n2 = 0;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getSum() {
        return sum;
    }
    public void calcSUm(){
        sum = n1+n2;
    }
}
