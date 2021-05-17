package com.company.logic;

public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b, -1, -1);
    }

    @Override
    public double content() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return 2*(this.a + this.b);
    }
}
