package com.company.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle a = new Circle(5);

    @Test
    void content() {
        assertEquals(78.53981633974483, a.content());
    }

    @Test
    void perimeter() {
        assertEquals(31.41592653589793, a.perimeter());
    }

    @Test
    void getD() {
        assertEquals(10, a.getD());
    }
}