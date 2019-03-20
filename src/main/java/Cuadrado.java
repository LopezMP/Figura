package main.java;

public class Cuadrado extends Rectangle {
    private double l;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public Cuadrado(double l) {
        super(l, l);
        this.l = l;
    }
}

