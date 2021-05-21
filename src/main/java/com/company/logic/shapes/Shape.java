package com.company.logic.shapes;

public class Shape {
    protected double a;

    public Shape(double a) {
        this.a = a;
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

}
