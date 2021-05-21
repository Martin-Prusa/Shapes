package com.company.logic.shapes;

public class Square extends Rectangle{
    public Square(double a) {
        super(a, a);
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        this.setB(a);
    }
}
