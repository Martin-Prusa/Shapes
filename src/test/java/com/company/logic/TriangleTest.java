package com.company.logic;

import com.company.logic.shapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle a = new Triangle(10,7,9,6);
    private Triangle b = new Triangle(5,7,10,6.5);

    @Test
    void content() {
        assertEquals(30, a.content());
        assertEquals(16.25, b.content());
    }

    @Test
    void perimeter() {
        assertEquals(26, a.perimeter());
        assertEquals(22, b.perimeter());
    }
}