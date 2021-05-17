package com.company.logic;

public class Shape {
    protected double a;
    protected double b;
    protected double c;
    protected double v;

    public Shape(double a, double b, double c, double v) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.v = v;
    }

    public double content() {
        return -1;
    }

    public double perimeter() {
        return -1;
    }


    //-----Getters and setters------------------
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
