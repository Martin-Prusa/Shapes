package com.company.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle a = new Triangle(10,7,9,6);

    @Test
    void content() {
        assertEquals(30, a.content());
    }

    @Test
    void perimeter() {
        assertEquals(26, a.perimeter());
    }
}