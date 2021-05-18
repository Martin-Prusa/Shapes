package com.company.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle a = new Rectangle(5, 8);

    @Test
    void content() {
        assertEquals(40, a.content());
    }

    @Test
    void perimeter() {
        assertEquals(26, a.perimeter());
    }
}