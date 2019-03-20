package main.java;

public class Triangulo extends Figura {
    private double b;
    private double h;

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public Triangulo (double b, double h){
        this.b=b;
        this.h=h;
    }
    @Override
    public double area() {
        return b*h/2;
    }
}
