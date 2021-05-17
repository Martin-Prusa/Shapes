package com.company.logic;

public class Circle extends Shape{
    public Circle(double a) {
        super(a, -1, -1, -1);
    }

    @Override
    public double content() {
        return Math.PI * Math.pow(this.a, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.a;
    }

    public double getD() {
        return 2*this.a;
    }
}
