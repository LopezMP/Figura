package main.java;

public class Main {
    public static void main(String[] args) {
        Figura cir = new Circulo(2);
        Figura cua = new Cuadrado(2.2);
        Figura rec = new Rectangle(3.3,2.01);
        Figura tri =new Triangulo(1,5);
        Figura[] l={cir, cua, rec, tri, tri, tri};
        System.out.println(GestorFigures.suma(l));


    }
}
