package main.java;

public interface GestorFigures {
    public static double suma (Figura[] l){
        double res=0;
        for (Figura f:l){
            res += f.area();
        }
        return res;
    }
}
