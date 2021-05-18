package com.company.logic;

public class Triangle extends Shape {

    public Triangle(double a, double b, double c, double v) {
        super(a, b, c, v);
    }

    @Override
    public double content() {
        return (a*v)/2;
    }

    @Override
    public double perimeter() {
        return this.a+this.b+this.c;
    }
}
