package com.company.logic.shapes;

public class Circle extends Shape{
    public Circle(double a) {
        super(a);
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
