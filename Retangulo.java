package org.example.q1;

public class Retangulo {

    private double h, b;

    public double calcArea(double b, double h){
        return b*h;
    }

    public double calcPerimetro(double b, double h){
        return 2*(b+h);
    }

    public void setBase(double b){
        this.b = b;
    }

    public void setAltura(double h){
        this.h = h;
    }

    public double getBase(){
        return b;
    }

    public double getAltura(){
        return h;
    }

}
