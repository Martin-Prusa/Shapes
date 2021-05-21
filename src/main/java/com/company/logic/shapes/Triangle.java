package com.company.logic.shapes;

public class Triangle extends Shape {
    private double b;
    private double c;
    private double v;

    public Triangle(double a, double b, double c, double v) {
        super(a);
        this.b = b;
        this.c = c;
        this.v = v;
    }

    @Override
    public double content() {
        return (a*v)/2;
    }

    @Override
    public double perimeter() {
        return this.a+this.b+this.c;
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
