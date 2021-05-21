package com.company.logic;

import com.company.logic.shapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square a = new Square(5);
    private Square b = new Square(6);

    @Test
    void content() {
        assertEquals(25, a.content());
        assertEquals(36, b.content());
    }

    @Test
    void perimeter() {
        assertEquals(20, a.perimeter());
        assertEquals(24, b.perimeter());
        a.setA(3);
        assertEquals(12, a.perimeter());

    }
}