package com.company.logic.shapes;

public class Rectangle extends Shape{
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double content() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return 2*(this.a + this.b);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
