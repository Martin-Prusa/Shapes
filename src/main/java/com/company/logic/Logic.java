package com.company.logic;

import com.company.data.Data;
import com.company.logic.shapes.Circle;
import com.company.logic.shapes.Rectangle;
import com.company.logic.shapes.Shape;
import com.company.logic.shapes.Square;

import java.util.ArrayList;

public class Logic {
    ArrayList<Shape> shapes = new ArrayList<>();

    public Logic() {
        ArrayList<String> list = Data.readData();
        for (String s : list) {
            String[] a = s.split(" ");
            if(a[0].equals("S")) shapes.add(new Square(Double.parseDouble(a[1])));
            else if(a[0].equals("C")) shapes.add(new Circle(Double.parseDouble(a[1])));
            else if(a[0].equals("R")) shapes.add(new Rectangle(Double.parseDouble(a[1]), Double.parseDouble(a[2])));
        }
    }


    public double perimeter() {
        int count = 0;
        int value = 0;
        for (Shape shape : shapes) {
            value+=shape.perimeter();
            count++;
        }
        return (float) value / count;
    }

    public double content() {
        int count = 0;
        int value = 0;
        for (Shape shape : shapes) {
            value+=shape.content();
            count++;
        }
        return (float) value / count;
    }
}
